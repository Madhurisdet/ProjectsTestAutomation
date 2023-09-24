package clients;

import java.util.Arrays;
import java.util.List;

import methods.MergeSortedList;

public class MergeSortedListClient {

	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 7 };
		Integer[] a2 = { 4, 5, 6, 8, 9 };
		List<Integer> list1 = Arrays.asList(a1);
		List<Integer> list2 = Arrays.asList(a2);

		List<Integer> mergedSortedList = MergeSortedList.mergeSortedList(list1, list2);
		mergedSortedList.stream().forEach(entry -> System.out.println(entry));
	}

}
