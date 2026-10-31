package Day1;

public class factorialofNumber {
    // Factorial of a number 6
    public static void main(String[] args) {

                int num = 6;
                int factorialNum = 1;

                for (int i = num; i >= 1; i--) {
                    factorialNum = factorialNum * i;
                }

                System.out.println(factorialNum);
            }
        }

