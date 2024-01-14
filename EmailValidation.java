package com.bridgelabz.regularexp;
import java.util.regex.*;

public class EmailValidation {
	
	 static String email = "abc.xyz@bridgelabz.co.in";
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

	 public static void UC2() {
		 String email = "abc.xyz@bridgelabz.co.in";
		 if (validateMandatoryParts1(email)) {
		     System.out.println("Mandatory parts are valid in the email address.");
		 }
		 else {
		     System.out.println("Mandatory parts are not valid in the email address");
		 }
	 }
		 	
		 public static  boolean validateMandatoryParts1(String email) {
		        
		        String abcPattern = "abc\\.";
		        String bridgeLabzPattern = "@bridgelabz\\.";
		  
		        {
		        Pattern abcPatternCompiled = Pattern.compile(abcPattern);
		        Pattern bridgeLabzPatternCompiled = Pattern.compile(bridgeLabzPattern);

		        // Match the patterns against the email
		        Matcher abcMatcher = abcPatternCompiled.matcher(email);
		        Matcher bridgeLabzMatcher = bridgeLabzPatternCompiled.matcher(email);
		        
		        // Check if both 'abc' and 'bridgelabz' are found in the email
		        return abcMatcher.find() && bridgeLabzMatcher.find();
		  }
		 
		      
		        	    
		 }	
		       
		 
	 
		 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UC1();
UC2();
UC3();
}
	private static void UC3() {
		// TODO Auto-generated method stub
	     if (StringValidation(email)) {
             System.out.println("String is valid");
         } else {
             System.out.println("String is invalid");}
         }
     

     private static boolean StringValidation(String email2) {
		// TODO Auto-generated method stub
		return false;
	}
	private static boolean isValidString(String email) {
         // Regular expression to match the mandatory 3D part and ensure it ends with "co"
         String regex = ".*3D.*co$";

         // Use String.matches() to check if the input matches the regular expression
         return email.matches(regex);
     }
 

}
