package methods;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedList {

	public static List<Integer> mergeSortedList(List<Integer> l1, List<Integer> l2) {
		int fp = 0;
		int sp = 0;
		List<Integer> mergedList = new ArrayList<Integer>();

		while (fp < l1.size() && sp < l2.size()) {
			if (l1.get(fp) < l2.get(sp)) {
				mergedList.add(l1.get(fp));
				fp++;
			}
			else {
				mergedList.add(l2.get(sp));
				sp++;
			}
		}

		if (fp == l1.size()) {
			while (sp < l2.size()) {
				mergedList.add(l2.get(sp));
				sp++;
			}
		}

		if (sp == l2.size()) {
			while (fp < l1.size()) {
				mergedList.add(l1.get(fp));
				fp++;
			}
		}
		return mergedList;
	}

}
