public class Fibonacci {

    public static int fibonacci_recursive(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
        }
    }

    public static int fibonacci_for_loop(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return -1;
        }

        int fib1 = 0;
        int fib2 = 1;

        if (n == 1) {
            return fib1;
        } else if (n == 2) {
            return fib2;
        }

        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }

        return result;
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Fibonacci(" + i + "): " + fibonacci_for_loop(i));
        }
    }
}
