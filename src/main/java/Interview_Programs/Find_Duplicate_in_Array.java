package Interview_Programs;

import java.util.HashSet;

public class Find_Duplicate_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,2,5,6,7,8,9,1};
		
		HashSet<Integer> value = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for (int num : arr) {
			if (!value.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("Duplicate value is : " + duplicate);
	}

}
