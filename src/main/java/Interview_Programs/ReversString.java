
package Interview_Programs;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Revers String : ");
		String str = sc.next();
	
		// login - 1 For Loop method
		int len = str.length();
		String rev = "";
		
		for (int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);	
		}
	
		// Logic - 2 StringBuilder
		// Logic - 3 StringBuffer	
		System.out.print("Revers String is : " + rev);
	}

}
