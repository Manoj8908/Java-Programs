package JAVA_Strings;

import java.util.Scanner;

public class StringLengthwolengthFunction {

	public static void main(String[] args) {
		
		int i =0;
		
		System.out.println("Ennter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(char c:ch) {
			i++;
		}
		System.out.println("The Length of string is:"+i );
	}

}
