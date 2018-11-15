package Naive;

public class _0366_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n > 2) {
            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n; i++) {
                f[i] = f[i - 2] + f[i - 1];
            }
            return f[n - 1];
        } else if (n == 2)
            return 1;
        else
            return 0;
    }
}
