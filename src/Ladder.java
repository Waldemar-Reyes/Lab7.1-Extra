import java.util.ArrayList;
import java.util.Scanner;

public class Ladder {
	static ArrayList<Integer> arr = new ArrayList<>();
	static int step = 0;
	
	public static void main (String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int cubes = sc.nextInt();
    	if (cubes == 1) {
    		System.out.println("1");
    	}
    	else {
    		ladder(cubes);
    		System.out.println(arr.size());
    	}
	}
	
	public static void ladder(int n) {
		int remainder = n - step++;
		 if (remainder > 0) {
			arr.add(step);
			ladder(remainder);
		}
	}
}
