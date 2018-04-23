import java.util.Random;
import java.util.Scanner;

public class MergeSortVar {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = rand.nextInt(1000000000) + 1;
		}
		sc.close();
	    mergeSort(arr);
	    for (int i=0; i<size; i++) {
	      System.out.print(arr[i] + "\n");
	    }
	}
	
//	System.out.println("\n" + arr[size-2]); TODO Second Part
	
	public static void mergeSort(int[] list) {
		if (list.length > 1) {
			int[] firstHalf = new int[list.length / 2];
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, list);
	    }
	}

	public static void merge(int[] list1, int[] list2, int[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2]) {
				temp[current3++] = list1[current1++];
			}
			else {
				temp[current3++] = list2[current2++];
			}
		}
	    while (current1 < list1.length) {
	    	temp[current3++] = list1[current1++];
	    }
	    while (current2 < list2.length) {
	      temp[current3++] = list2[current2++];
	    }
	}
}
