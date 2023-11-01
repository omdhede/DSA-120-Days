public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes a parameter and prints it
        // print first five numbers: 1 2 3 4 5

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }

    // all the functions are exactly doing the same thing, just the bodies are different.
}
