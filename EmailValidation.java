package com.bridgelabz.regularexp;
import java.util.regex.*;

public class EmailValidation {
	public static void UC1(){
		String email = "abc.xyz@bridgelabz.co.in";
        if (validateABC(email)) {
            System.out.println("ABC is valid in the email address.");
        } else {
            System.out.println("ABC is not valid in the email address.");
        }
	}
	 public static boolean validateABC(String email) {
	        // Regex pattern to match the 'abc' part
	        String abcPattern = "abc\\.";

	        // Compile the regex pattern
	        Pattern pattern = Pattern.compile(abcPattern);

	        // Match the pattern against the email
	        Matcher matcher = pattern.matcher(email);

	        // Check if 'abc' is found in the email
	        return matcher.find();
	 
	}

	 
		 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UC1();
//UC2();

	}
	



}
