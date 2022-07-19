package com.ExceptionHandling;

public class Finally_ThreadSleep_Break {

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(2000);		//Process holded
		
		System.out.println("a");
		
		for (int i = 0; i < args.length; i++) {
			
			int a = i/0;
			
			if (a!=2) {
				
				break;			//Process loop break
			}
			
		}
		
		System.out.println("exit method will be executed next");

		System.exit(0);			//Process terminated completely
		
		System.out.println("d");
	}

}
