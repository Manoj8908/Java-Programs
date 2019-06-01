package JAVA_Array;

public class objectArray {

	public static void main(String[] args) {
		
		Object a[]=new Object[5];
		a[0]=10;
		a[1]=20.55;
		a[2]='M';
		a[3]=true;
		a[4]="Welcome";
		
		for(Object i : a) {
			System.out.println(i);
		}

	}

}
