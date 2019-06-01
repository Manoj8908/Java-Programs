package OOPS;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading(){
		
		a=10;
		b=30;
		c=10.55;
	}
	ConstructorOverloading(int x, int y){
		 a=x;
		 b=y;
		
	}
	ConstructorOverloading(int x, double y){
	
	a=x;
	c=y;
	}
	ConstructorOverloading(int x, int y , int z){
		
		a=x;
		b=y;
		c=z;
		}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading();
		co.display();
		
		ConstructorOverloading co1 = new ConstructorOverloading(20,30);
		co1.display();
		
		ConstructorOverloading co2 = new ConstructorOverloading(40,55.56);
		co2.display();
		
		ConstructorOverloading co3 = new ConstructorOverloading(10,40,60);
		co3.display();
	}	

}
