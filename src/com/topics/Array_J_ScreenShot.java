package com.topics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Array_J_ScreenShot {

	public static void main(String[] args) throws AWTException, IOException {
		
		int [] a = new int [3];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
	//	a[3] = 5; --> ArrayIndexOutOfBoundException will be thrown at Runtime
		
		System.out.println("Array value is declared at run time : " + a[2]);
		
		int b[] = {1, 2, 3, 4};
		
		System.out.println("Array value is declared while writing the program : " + b[0]);
	
	
		int [][]  twod   = {{8,9},
							{2,3}};
		
		System.out.println(twod[1][1]);
	
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Rectangle r = new Rectangle(screenSize);
		 Robot ro = new Robot();
		 BufferedImage source = ro.createScreenCapture(r);
		 File destination = new File("C:users\\Screenshot.png");
		 ImageIO.write(source, "png", destination);
		 
	
	}
}
