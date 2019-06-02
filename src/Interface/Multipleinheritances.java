package Interface;

interface a{
	int a =10;
	void display();
}
interface b{
	int b =20;
	void show();
}
public class Multipleinheritances implements a,b {
	
	public void show() {
		
		System.out.println(a);
	}

	
	public void display() {
		
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		Multipleinheritances mi = new Multipleinheritances();
		mi.display();
		mi.show();
		

	}

	
	

}
