public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes a parameter and prints it
        // print first five numbers: 1 2 3 4 5

        print(1);
    }


    static void print(int n) {

        if ( n == 5 ) {
            System.out.println(5);
            return;
        }

//    if you are calling a function again and again you can treat it as call in the stack

        System.out.println(n);
        print(n + 1);
    }
}
