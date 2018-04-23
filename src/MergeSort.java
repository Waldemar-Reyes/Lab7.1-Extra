import java.util.Scanner;

public class MergeSort {
	private static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		sort(0,size-1);
		for (int i=0; i<size; i++) {
		      System.out.print(arr[i] + " ");
		}
	}

	public static void merge(int low, int half, int sup) {
		int leftSide = half - low + 1;
		int rightSide = sup - half;
		int left[] = new int [leftSide];
	    int right[] = new int [rightSide];
	    
	    for (int i=0; i<leftSide; ++i) {
	    	left[i] = arr[low+i];
	    }
	    for (int j=0; j<rightSide; ++j) {
	        right[j] = arr[half+1+j];
	    }
	 
	    int i = 0;
	    int j = 0;
	    int k = low;
	    while (i < leftSide && j < rightSide) {
	    	if (left[i] <= right[j]) {
	    		arr[k] = left[i];
	            i++;
	        }
	        else {
	        	arr[k] = right[j];
	            j++;
	        }
	    	k++;
	    }
	    while (i < leftSide) {
	    	arr[k] = left[i];
	        i++;
	        k++;
	    }
	    while (j < rightSide) {
	    	arr[k] = right[j];
	    	j++;
	    	k++;
	    }
	}
	
	public static void sort(int low, int sup) {
		if (low < sup) {
			int half = (low+sup)/2;
			sort(low, half);
	        sort(half+1, sup);
	        merge(low, half, sup);
		}
	}
}