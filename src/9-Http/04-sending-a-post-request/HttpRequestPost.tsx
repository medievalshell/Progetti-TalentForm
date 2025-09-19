import axios from "axios";
import React, { useState, useEffect, useCallback } from "react";
import HttpRequestPostMoviesList from "./components/HttpRequestPostMoviesList";
import HttpRequestPostAddMovie from "./components/HttpRequestPostAddMovie";
import "./HttpRequestPost.css";
import { IHttp } from "../model/IHttp";

const HttpRequestPost: React.FC<IHttp> = () => {
  const [movies, setMovies] = useState<IHttp[]>([]);
  const [isLoading, setIsLoading] = useState<boolean>(false);
  const [error, setError] = useState<string>("");

  const fetchMoviesHandler = useCallback(async () => {
    setIsLoading(true);
    setError("");
    try {
      const response = await axios.post(
        "https://corso-talentform-default-rtdb.firebaseio.com/movies.json"
      );
      if (!response.data) {
        throw new Error("Something went wrong!");
      }

      const data = await response.data;

      const loadedMovies = [];

      for (const key in data) {
        loadedMovies.push({
          id: key,
          title: data[key].title,
          openingText: data[key].openingText,
          releaseDate: data[key].releaseDate,
        });
      }

      setMovies(loadedMovies);
    } catch (error) {
      setError("");
    }
    setIsLoading(false);
  }, []);

  useEffect(() => {
    fetchMoviesHandler();
  }, [fetchMoviesHandler]);

  const addMovieHandler = async (movie: IHttp) => {
    const response = await axios.post(
      "https://corso-talentform-default-rtdb.firebaseio.com/movies.json",
      {
        method: "POST",
        body: JSON.stringify(movie),
        headers: {
          "Content-Type": "application/json",
        },
      }
    );
    const data = await response.data;
    console.log(data);
  };

  let content = <p>Found no movies.</p>;

  if (movies.length > 0) {
    content = <HttpRequestPostMoviesList movies={movies} />;
  }

  if (error) {
    content = <p>{error}</p>;
  }

  if (isLoading) {
    content = <p>Loading...</p>;
  }

  return (
    <React.Fragment>
      <section>
        <HttpRequestPostAddMovie onAddMovie={addMovieHandler} />
      </section>
      <section>
        <button onClick={fetchMoviesHandler}>Fetch Movies</button>
      </section>
      <section>{content}</section>
    </React.Fragment>
  );
};

export default HttpRequestPost;
