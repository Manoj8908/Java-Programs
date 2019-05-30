package java_basic;

import java.util.Scanner;

public class CountOfString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Count(str);
		
	}
	
	static void Count(String str) {
		
		// Create an char array of given String 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) {
        	
        	// Declare an String with empty initialization 
            String s = ""; 
  
            // When the character is not space 
            while (i < ch.length && ch[i] != ' ') { 
  
                // concat with the declared String 
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + "->" + s.length());             
        } 
    } 
        
	}


