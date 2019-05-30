package java_basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String Reverse = " ";
		
		for(int i=S1.length()-1;i>=0;i--) {
			Reverse = Reverse+S1.charAt(i);
		}
		System.out.print("The Reverse String is:");
		System.out.println(Reverse);
	}

}
