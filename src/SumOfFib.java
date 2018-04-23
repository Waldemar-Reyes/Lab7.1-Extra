import java.util.Scanner;

public class SumOfFib {
	static Scanner sc = new Scanner(System.in);
	static int fib = sc.nextInt();
	static long[] cached = new long[fib+1];

	public static void main(String[] args) {
		for (int i = 0; i < fib+1; i++) {
            cached[i] = -1;
        }
		f(fib);
		if (fib < 3) {
			System.out.println("-1");
		}
		else {
			String arrStr = "";
			arrStr += String.valueOf(cached[fib-3] + " ");
			arrStr += String.valueOf(cached[fib-2] + " ");
			arrStr += String.valueOf(cached[fib-2]);
			System.out.println(arrStr);
		}
	}
	
	public static long f(int n){
		long result;
		if (cached[n] != -1) {
			return cached[n];
		}
		if (n < 2) {
			result = 1; 
		}
		else {
			result = f(n-1) + f(n-2);
		}
		cached[n] = result;
		return result;
	}
}