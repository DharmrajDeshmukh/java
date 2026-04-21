class Practical13B {

    static void sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        System.out.println("Sum = " + total);
    }

    static void fun(String... s) {
        System.out.println("String varargs");
    }

    static void fun(int... i) {
        System.out.println("Int varargs");
    }

    static void display(int x, int... y) {
        System.out.println("First: " + x);
        System.out.print("Remaining: ");
        for (int i : y) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        sum(10, 20, 30);
        sum(5, 15);

        display(1, 2, 3, 4);

        // fun(); // ambiguous

        fun("hello", "world");
        fun(1, 2, 3);
    }
}