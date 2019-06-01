package JAVA_Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String s[] = new String[3];
		s[0]="Welcome";
		s[1]="To";
		s[2]="Jungle";
		
		System.out.println("The length of String:"+s.length);
		for(String i : s) {
			System.out.println(i);
		}
	}

}
