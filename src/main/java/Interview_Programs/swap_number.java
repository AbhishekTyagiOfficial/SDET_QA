
package Interview_Programs;

import java.util.Scanner;

public class swap_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Swap the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Swap the value of b : ");
		int b = sc.nextInt();
		
		int c;
	/*	
		// Logic-1 Use Third Variable
		c=a; // 10
		a=b; // 20
		b=c; // 10
	*/
		
	/*
		// Logic-2 Use Multiply Method
		a= a*b; // 200
		b= a/b; // 200/20 =10
		a= a/b; // 200/10 =20
	*/
		
	/*
		// Logic-3 Use Bit Operators
		a = a^b; 
		b = a^b;
		a = a^b;
	*/
		
	/*
		// Logic-4 Use without Third Variable
		 b = (a+b) - (a=b);  // 30 - 20 = 10
	*/ 
		
		
		// Logic-5 Use without Third Variable
		a = a + b;  //30
		b = a - b;  // 30-20 = 10
		a = a - b;  //30-10 =  20
		System.out.println("After Swap the value of a = " + a + " and b = " + b);
	}	

}
