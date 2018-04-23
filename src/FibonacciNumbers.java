import java.util.Scanner;

public class FibonacciNumbers {
	static Scanner sc = new Scanner(System.in);
	static int fib = sc.nextInt();
	static long[] cached = new long[fib+1];
	

	public static void main(String[] args) {
		for (int i = 0; i < fib+1; i++) {
            cached[i] = -1;
        }
		System.out.println(f(fib));
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