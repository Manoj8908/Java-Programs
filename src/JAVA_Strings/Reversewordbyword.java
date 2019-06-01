package JAVA_Strings;

import java.util.Scanner;

public class Reversewordbyword {

	public static void main(String[] args) {
		
		System.out.println("Enter the Sentences:");
		Scanner sc = new Scanner(System.in);
		String InputString = sc.nextLine();
		//to keep store in an array
		String[] words = InputString.split("\\s");
		String OutputString = "";
		
		for(int i = words.length-1;i>=0;i--) {
			
			OutputString=OutputString+words[i]+" ";
		}
		System.out.print("The Reverse word by word string:");
		System.out.println(OutputString);

	}

}
