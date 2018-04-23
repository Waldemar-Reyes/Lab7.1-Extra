import java.util.ArrayList;
import java.util.Scanner;

public class OrderedPair {
	static ArrayList<Integer> pairs = new ArrayList<>();
	static int counter = 0;

    public static void main (String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int[] arr = new int[size];
    	for (int i=0; i < size; i++) {
    		arr[i] = sc.nextInt();
    	}
    	sc.close();
	    orderedPairs(arr, 0);
	    System.out.println(counter);
	    for (int i=0; i < pairs.size()-1; i+=2) {
	    		System.out.println(pairs.get(i) + " " + pairs.get(i+1));
	    	}
	    }
    
    static void orderedPairs(int[] arr, int index) {
    	if (index < arr.length-1) {
    		if (arr[index] < arr[index+1]) {
    	    	pairs.add(arr[index]);
    	    	pairs.add(arr[index+1]);
    	    	counter++;
    	    	orderedPairs(arr, index+1);
    	    }
    	    else {
    	    	orderedPairs(arr, index+1);
    	    }
    	}  
    }
}