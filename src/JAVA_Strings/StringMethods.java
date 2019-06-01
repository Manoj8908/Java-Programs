package JAVA_Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		String s1 = " To My World";
		
		String s2 = "WELCOME";
		
		System.out.println("The length of string is :"+s.length());
		//Concatnation
		
		System.out.println("The join of two String is: "+s+s1);
		
		System.out.println(s.concat(s1));
		
		//Equlas
		
		System.out.println(s.equals(s2));
		
		//Equals Ignore case
		System.out.println(s.equalsIgnoreCase(s2));
		
		//Contains
		System.out.println(s.contains("elc"));
		
		//SubStrings
		System.out.println(s.substring(0, 3));
		
		System.out.println(s.substring(4, 7));
		
		//Replace
		
		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("com", "moc"));
		
	}

}
