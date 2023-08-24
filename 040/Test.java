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

        // int digits = 0;

        // while (number != 0)
        // {
        //     number = number / 10;
        //     ++digits;
        // }

        int digits = (int) Math.log10((double) number) + 1;
        int divisor = (int) Math.pow(10.0, (double) (digits - 1));

        int sum = 0;

        while (divisor >= 10)
        {
            int extracted_digit = number / divisor;
            sum = sum + extracted_digit;
            System.out.print(extracted_digit + " + ");
            number = number % divisor;
            divisor = divisor / 10;
        }

        System.out.println(number + " = " + (sum + number));
    }
}
