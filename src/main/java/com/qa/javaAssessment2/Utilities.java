package com.qa.javaAssessment2;

import java.util.Scanner;

public class Utilities {
	
	public static String input(String helperText) {				//helperText allows a description of what data is required before the input is given
		System.out.println(helperText);
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

	public String input() {				//this override means if no helper text is required, the scanner will still run
		return this.input(null);
	}

}
