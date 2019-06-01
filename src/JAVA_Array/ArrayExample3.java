package JAVA_Array;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		
		int a[]= {100,200,300,400,500,600};
		int sum = 0;
		
		for(int i:a) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The sum of Array value is :"+sum);
	}

}
