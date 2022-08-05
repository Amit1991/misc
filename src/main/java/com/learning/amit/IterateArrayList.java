package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		Integer[] intArr = new Integer[]{99,88,77,66,55,44,33,22,11};
		intList = Arrays.asList(intArr);
		
		for (Iterator<Integer> iterator = intList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("---------------------------------------");
		
		for (Integer integer : intArr) {
			System.out.println(integer);
		}
		
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < intList.size(); i++) {
			Integer integer = intList.get(i);
			System.out.println(integer);
			
		}
		
		System.out.println("---------------------------------------");
		
		for (ListIterator<Integer> iterator = intList.listIterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}