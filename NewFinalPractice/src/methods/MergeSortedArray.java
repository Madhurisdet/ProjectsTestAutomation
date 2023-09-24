package methods;

public class MergeSortedArray {

	public static int[] mergeSortedArray(int[] firstArray, int[] secondArray) {

		int len1 = firstArray.length;
		int len2 = secondArray.length;

		int[] mergedSortedArray = new int[len1 + len2];

		int msp = 0;
		int fp = 0;
		int sp = 0;

		while (fp < len1 && sp < len2) {
			if (firstArray[fp] < secondArray[sp]) {
				mergedSortedArray[msp] = firstArray[fp];
				fp++;
				msp++;
			} else {
				mergedSortedArray[msp] = secondArray[sp];
				sp++;
				msp++;
			}
		}

		if (fp == len1) {
			while (sp < len2) {
				mergedSortedArray[msp] = secondArray[sp];
				msp++;
				sp++;
			}
		}

		if (sp == len2) {
			while (fp < len1) {
				mergedSortedArray[msp] = firstArray[fp];
				msp++;
				fp++;
			}
		}

		return mergedSortedArray;
	}

	public static int[] mergeSortedArray1(int[] firstArray, int[] secondArray) {

		int len1 = firstArray.length;
		int len2 = secondArray.length;

		int[] mergedSortedArray = new int[len1 + len2];

		int fp = len1 - 1;
		System.out.println("fp->" + fp);
		int sp = len2 - 1;
		System.out.println("sp->" + sp);
		int msp = len1 + len2 - 1;
		System.out.println("msp->" + msp);

		while (sp >= 0) {
			if (fp >= 0 && firstArray[fp] > secondArray[sp]) {
				mergedSortedArray[msp--] = firstArray[fp--];
			} else {
				mergedSortedArray[msp--] = secondArray[sp--];
			}
		}

		return mergedSortedArray;
	}
	
	public static int[] mergeSortedArray2(int[] firstArray, int[] secondArray) {

		int len1 = firstArray.length;
		int len2 = secondArray.length;

		int[] mergedSortedArray = new int[len1 + len2];

		int fp = 0;
		int sp = 0;
		int msp = 0;
		
		while (fp < len1 && sp < len2) {
			if(firstArray[fp]<secondArray[sp]) {
				mergedSortedArray[msp++] = firstArray[fp++];
			}else {
				mergedSortedArray[msp++] = secondArray[sp++];
			}
		}
		
		if(fp == len1) {
			while(sp<len2) {
				mergedSortedArray[msp++] = secondArray[sp++];
			}
		}
		
		if(sp == len2) {
			while(fp<len1) {
				mergedSortedArray[msp++] = firstArray[fp++];
			}
		}
		
		return mergedSortedArray;
	}

}
