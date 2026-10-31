package Day1;

public class SumOfNumber {
    // Sum of numbers from 1 to 100  --> 5050
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=100; i++)
        {
            sum =sum + i;
        }
        System.out.print(sum);
    }
}
