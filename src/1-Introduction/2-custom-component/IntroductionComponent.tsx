import React from "react";
import SonComponent from "./introduction_components/SonComponent";

const IntroductionComponent = () => {
  return (
    <div>
      <h2>Ho ricevuto delle informazioni dal SonComponent </h2>

      <div>
        <SonComponent />
      </div>
    </div>
  );
};

export default IntroductionComponent;
