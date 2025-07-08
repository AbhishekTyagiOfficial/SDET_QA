package Interview_Programs;

import java.util.HashSet;

public class Find_Duplicate_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 3, 2, 5, 6, 7, 8, 9, 1 };

		HashSet<Integer> value = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();

		// Duplicate Elements in Array
		for (int num : arr) {
			if (!value.add(num)) {
				duplicate.add(num);
			}
		}

		/*
		 * // Remove Duplicate elements in Array 
		 * //HashSet<Integer> remove = new HashSet<>(); 
		 * for (int num : arr)
		 *  {
			 *  if (value.add(num)) 
			 *  { 
			 *  	remove.add(num); 
			 *  }
		 *   }
		 * 
		 * System.out.println("Remove Duplicate value is : " + remove);
		 */
		
		System.out.println("Duplicate value is : " + duplicate);
	}

}
