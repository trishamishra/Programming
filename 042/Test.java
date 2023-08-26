import java.util.Scanner;
import java.lang.Math;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        int digits = (int) Math.log10((double) number) + 1;
        int divisor = (int) Math.pow(10.0, (double) (digits - 1));

        int first_digit = number / divisor;
        int last_digit = number % 10;

        int temp1_number = number % divisor;
        int temp2_number = last_digit * divisor + temp1_number;
        int temp3_number = temp2_number / 10;

        int new_number = temp3_number * 10 + first_digit;

        System.out.println("After swapping first and last digits, " +
                           new_number);
    }
}
