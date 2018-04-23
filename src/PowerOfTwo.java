import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(powerOfTwo(sc.nextLong()));
		sc.close();
	}
	
	public static String powerOfTwo(long n) {
        if (n==1) {
            return "yes";
        } 
        else if (n%2 != 0 || n==0) {
            return "no";
        }
        else {
            return powerOfTwo(n/2);
        }
    }
}