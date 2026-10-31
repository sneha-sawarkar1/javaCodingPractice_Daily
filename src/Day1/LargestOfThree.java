package Day1;

public class LargestOfThree {
// Find largest of three numbers
        public static void main(String[] args) {
            int num1 = 25;
            int num2 = 35;
            int num3 = 40;

            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " num1 is largest number");
            } else if (num2 >= num3 && num2 >= num1) {
                System.out.println(num2 + " num2 is largest number");
            } else {
                System.out.println(num3 + " num3 is largest number");
            }
        }
    }
