package com.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_Write_file {

	public static void main(String[] args) throws FileNotFoundException  {

		// Read a file
		File f = new File("C:\\Users\\jovin\\Documents\\Career\\TESTING\\Notes\\Own\\Checklists.txt");

		Scanner s = new Scanner(f);

		while (s.hasNextLine()) {

			System.out.println(s.nextLine());

		}

		/*// Write a file

		FileWriter fw = new FileWriter("C:\\Users\\jovin\\Documents\\Career\\TESTING\\Notes\\Own\\Checklists.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("this line is added newly through buffered writer");

		while (s.hasNextLine()) {

			System.out.println(s.nextLine());

		}*/
	}

}
