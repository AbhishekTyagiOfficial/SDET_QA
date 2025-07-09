package Interview_Programs;

import java.util.Arrays;

public class ReversArray {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		
		System.out.println("Arrays is : " + Arrays.toString(arr));
		
		int start = 0;
		int end = arr.length-1;
		
		while (start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}

		System.out.print("Revers Arrays is : " + Arrays.toString(arr));
	}

}
