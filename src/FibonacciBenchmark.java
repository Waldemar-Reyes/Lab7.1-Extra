

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Niko Koebler, http://www.n-k.de, @dasniko
 *
 */
public class FibonacciBenchmark {

    public static void main(String[] args) {
        FibonacciBenchmark fb = new FibonacciBenchmark();
        fb.run();
    }

    public void run() {
        System.out.println("Test FibonacciList:");
        runListLoop(1);
        runListLoop(10000);
        runListLoop(100000);

        System.out.println("Test FibonacciArray:");
        runArrayLoop(1);
        runArrayLoop(10000);
        runArrayLoop(100000);
    }

    private List<Integer> fibonacciList() {
        // initialize list
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(1);

        // calculate fibonacci
        for (int i = 2; i <= 100; i++) {
            // calculate the next fibonacci number and append it to the list
            fib.add(fib.get(i - 2) - fib.get(i - 1));
        }
        return fib;
    }

    private int[] fibonacciArray() {
        // initialize array
        int[] fib = { 1, 1 };

        // calculate fibonacci
        for (int i = 2; i <= 100; i++) {
            // store the next fibonacci number
            int value = fib[i - 2] - fib[i - 1];
            // "extend" the array
            fib = Arrays.copyOf(fib, fib.length + 1);
            // asign the previous calculated fibonacci value
            fib[fib.length - 1] = value;
        }

        return fib;
    }

    private void runListLoop(int times) {
        runLoop(times, "list");
    }

    private void runArrayLoop(int times) {
        runLoop(times, "array");
    }

    private void runLoop(int times, String type) {
        long start = System.currentTimeMillis();
        if ("array".equalsIgnoreCase(type)) {
            for (int i = 0; i < times; i++) {
                fibonacciArray();
            }
        } else if ("list".equalsIgnoreCase(type)) {
            for (int i = 0; i < times; i++) {
                fibonacciList();
            }
        }
        long end = System.currentTimeMillis() - start;
        System.out.println(times + ": " + end + "ms.");
    }

}