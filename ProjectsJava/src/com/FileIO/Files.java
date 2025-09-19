package com.FileIO;


import java.io.File;
import java.io.IOException;


public class Files {

	public static void main(String[] args) {


		Files m = new Files();

		String dir = "E:\\corso_java\\test-dir";
		String file = dir + "\\test-file.txt";

		m.creaDirectory(dir);
		m.creaFile(file);

		File d = new File(dir);
		System.out.println(d.isDirectory());

		File f = new File(file);
		System.out.println(f.isFile());

		File[] files = d.listFiles();

		for (File file2 : files) {
			System.out.println(file2.getName());

			file2.delete();
		}
	}

	public void creaFile(String path) {
		File f = new File(path);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void creaDirectory(String path) {
		File d = new File(path);

		if (!d.exists()) {
			d.mkdir();
		}


		try {
			File myObj = new File("filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();


		}


	}
}