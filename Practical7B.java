public class Practical7B {

    static long rfact(long n) {
        if (n <= 1) return 1;
        return n * rfact(n - 1);
    }

    static long ifact(long n) {
        long total = 1;
        for (long i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {

        long n = 20;
        int runs = 100000;
        long dummy = 0;

        // Warm-up
        for (int i = 0; i < 10000; i++) {
            ifact(n);
            rfact(n);
        }

        long f1tt = 0, f2tt = 0;

        for (int i = 0; i < runs; i++) {

            long start1 = System.nanoTime();
            dummy += ifact(n);
            long end1 = System.nanoTime();
            f1tt += (end1 - start1);

            long start2 = System.nanoTime();
            dummy += rfact(n);
            long end2 = System.nanoTime();
            f2tt += (end2 - start2);
        }

        System.out.println("Ignore this: " + dummy);

        System.out.println("Iterative Avg Time: " + (double) f1tt / runs);
        System.out.println("Recursive Avg Time: " + (double) f2tt / runs);
    }
}