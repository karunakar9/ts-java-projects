package com.oopsabstract;

import java.io.File;
import java.io.FileOutputStream;
import java.io.File;  // Import the File class
	import java.io.IOException;  // Import the IOException class to handle errors

	public class AbstractMain {
	  public static void main(String[] args) {
	    try {
	     // File myObj = new File("C:Temp\\adi.csv");
	    	FileOutputStream os = new FileOutputStream("C:\\Temp\\adi1.csv");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}

