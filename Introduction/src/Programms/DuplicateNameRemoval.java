package Programms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNameRemoval {

	public static void main(String[] args) {
		int[] InitialArray = { 7,1, 4, 5, 7,8,0,0,0,7,2,4};
		
		Integer[] ArrayWithoutDuplicate = removeDupUsingset(InitialArray);
		
		System.out.println("Original array is ");
		for (int element : InitialArray) {
			
			System.out.println(element);
		}
			
		System.out.println("Array after removing duplicates is ");
		for (int element : ArrayWithoutDuplicate) {
			
			System.out.println(element);
		}
		
		
	}

	public static Integer [] removeDupUsingset (int [] input) {
		
		Set<Integer> set = new HashSet<Integer> ();
		for (int element : input) {
			set.add(element);
		}
		
		Integer[] ArrayWithoutDuplicate = set.toArray(new Integer[set.size()]);
		return ArrayWithoutDuplicate;
	}
	
}
