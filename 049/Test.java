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

        //////////////////////////////////////////////////////////

        // int number_of_digits = (int) log10((double) number) + 1;

        int number_of_digits = 0;
        int temp1 = number;

        while (temp1 != 0)
        {
            ++number_of_digits;
            temp1 = temp1 / 10;
        }

        //////////////////////////////////////////////////////////////

        int divisor = 1;
        int count = 1; // loop_counter

        while (count < number_of_digits)
        {
            divisor = divisor * 10;
            ++count;
        }

        //////////////////////////////////////////////////////////////

        int result = 0;
        int temp2 = number;

        while (temp2 > 0)
        {
            int first_digit = temp2 / divisor;
            result = result + (int) Math.pow((double) first_digit, (double) number_of_digits);

            temp2 = temp2 % divisor;
            divisor = divisor / 10;
        }

        /////////////////////////////////////////////////////////

        if (result == number)
            System.out.println(number + " is an armstrong number");
        else
            System.out.println(number + " is not an armstrong number");
    }
}

/*

1)
Enter a positive integer: 1
1 is an armstrong number

2)
Enter a positive integer: 10
10 is not an armstrong number

3)
Enter a positive integer: 153
153 is an armstrong number

*/
