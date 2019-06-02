package DataStructure;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(200);
		al.add("Manoj");
		al.add(10.55);
		
		System.out.println(al);
		
		ArrayList<String> als = new ArrayList<String>();
		als.add("Raj");
		als.add("Situ");
		als.add("Manoj");
		
		for(String s:als) {
			System.out.println(s);
		}
	}

}
