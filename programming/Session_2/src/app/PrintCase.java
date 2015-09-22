package app;

import java.io.IOException;

public class PrintCase {
	public void method(Object o){
		System.out.println("Object Version");
	}
	
	public void method(java.io.IOException s){
		System.out.println("IOException Version");
	}
	
	public void method(java.io.FileNotFoundException s){
		System.out.println("java.io.FileNotFoundException Version");
	}
	
	public static void main(String args[])
	{
		PrintCase tc = new PrintCase();
		
		IOException ex = null;
		
		tc.method(ex);
	}
}
