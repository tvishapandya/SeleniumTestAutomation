package Logical;

public class FizzBuzz {

    public static void fizzBuzz(int n) {

        if ((n % 5 == 0) && (n % 7 == 0)) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {

            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Number is neither fizz nor Buzz ");
        }
    }

    public static void main(String args[]) {
        FizzBuzz.fizzBuzz(17);
    }
}
