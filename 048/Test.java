import java.util.Scanner;

class Test
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int number1, number2;
        System.out.print("Enter 2 positive integers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        if (number1 > number2)
        {
            int lcm = number1;

            while (lcm % number2 != 0)
            {
                lcm = lcm + number1;
            }

            System.out.println("LCM = %d\n", lcm);
        }

        else if (number2 > number1)
        {
            int lcm = number2;

            while (lcm % number1 != 0)
            {
                lcm = lcm + number2;
            }

            System.out.println("LCM = %d\n", lcm);
        }

        else
        {
            System.out.println("LCM = %d\n", number1);
        }

        // int number;
        // System.out.println("Enter a positive integer: ");
        // scanf("%d", &number);

        // int starting_point;
        // System.out.println("Enter starting point: ");
        // scanf("%d", &starting_point);

        // while (starting_point % number != 0)
        // {
        //     ++starting_point;
        // }

        // System.out.println("HCF is: %d", starting_point);

        return 0;
    }



    /*

    Enter a positive integer: 13
    Enter starting point: 50
    The next multiple is 52

    Enter a positive integer: 20
    Enter starting point: 40
    The next multiple is 40

    */

    /*

    1)
    Enter 2 positive integers: 1 5
    LCM = 5

    2)
    Enter 2 positive integers: 7 8
    LCM = 56

    */
