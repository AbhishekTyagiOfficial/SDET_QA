package Interview_Programs;

public class MissingNumberFinder {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7};
		
		int n = arr.length + 1; // actual size is 7
		
		int totalsum = n*(n+1)/2; // 7 * (7 +1) / 2 = 28
		int sum = 0;

		for (int a : arr)
		{
			sum += a; // 1+2+3+4+5+7 = 22
		}
		
		int missing_no = totalsum - sum;
		System.out.println("Missing Value is : " + missing_no);
	}

}
