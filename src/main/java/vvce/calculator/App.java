package vvce.calculator;

public class App {

    public static String checkEvenOdd(int num) {

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        int num = 10;

        System.out.println(num + " is " + checkEvenOdd(num));
    }
}