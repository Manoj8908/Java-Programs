package OOPS;

public class MethodOverloading {

	int a;
	int b;
	void sum() {
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int x,int y) {
		
		int a = x;
		int b = y;
		System.out.println(a+b);
	}
	void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	void sum(int x,double y) {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading MO = new MethodOverloading();
		MO.sum();
		MO.sum(100, 200);
		MO.sum(500, 600.10);
		MO.sum(300, 400, 500);
		
		

	}

}
