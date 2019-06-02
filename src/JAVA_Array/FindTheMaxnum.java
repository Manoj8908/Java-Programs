package JAVA_Array;

public class FindTheMaxnum {

	public static void main(String[] args) {
		
		double[] a = {2.1,2,4,555,666,789,1000};
		
		double max = a[0];
		
		for(int i =0;i<a.length;i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
			 
		}
		System.out.println("The largest number is :"+max);
	}

}
