package Day1;

public class NumberDivisable {
    //Check whether a number is divisible by both 5 and 11
    public static void main(String[] args) {


        int num = 100;

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Input: " + num + " is divisible by both 5 and 11.");
        } else {
            System.out.println("Input: " + num + " is not divisible by both 5 and 11.");
        }
    }
}