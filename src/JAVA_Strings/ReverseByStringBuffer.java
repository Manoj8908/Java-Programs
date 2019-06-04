package JAVA_Strings;

public class ReverseByStringBuffer {
	
	public static void main(String args[]) {
		String str = "This is Selenium Webdriver";
				
		int i = str.length();
				
		StringBuffer strb = new StringBuffer();
		
		for( int j=i-1;j>=0;j--)
		{
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}

}
