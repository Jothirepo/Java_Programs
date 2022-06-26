package com.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class How_to_read_write_in_file {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\Dump\\Dummy.txt");

		BufferedWriter bw = new BufferedWriter(fw);//an object which will point to the file 
		
		bw.write("this is jothi here"); 
		
		System.out.println("it has been written");
		
		File f = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\Dump\\Dummy.txt");

		Scanner s = new Scanner(f);
		
		while (s.hasNextLine()) {
			
			System.out.println(s.nextLine());
		}
		
	}

}
