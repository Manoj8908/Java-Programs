package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=0;
		 m = n/2;
		 int flag=0;
		
		if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			  }
			  
		for(int i =2;i<=m;i++)
		{
		if(n%2==0) 
		{
			 System.out.println(n+" is not prime number");
			 flag=1;
			 break;
		}
}
		if(flag==0) {
			System.out.println(n+" is a prime number");
		}

	}
}
