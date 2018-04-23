import java.util.Scanner;

public class FibonacciNumbersArrayVar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fib = sc.nextInt()+1;
		sc.close();

		long[] arr = new long[fib];

		if (fib-1 < 2) {
			System.out.println("1");
		}
		else {
			arr[0] = 1;
			arr[1] = 1;
			
			for(int i=2; i < fib; i++){
				arr[i] = arr[i-1] + arr[i-2];
			}
			System.out.println(arr[fib-1]);
		}
	}
}