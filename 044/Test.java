import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double b;
        System.out.print("Enter the base: ");
        b = sc.nextDouble();

        int e;
        System.out.print("Enter the integral exponent: ");
        e = sc.nextInt();

        System.out.print("\n");

        if ((b == 0.0) && (e == 0))
        {
            System.out.println("0 ^ 0 is undefined");
        }

        // else if (((b > 0.0) || (b < 0.0)) && (e == 0))
        // else if ((b != 0.0) && (e == 0))
        else if (e == 0)
        {
            System.out.println(b + "^ 0 = 1");
        }

        else if ((b == 0.0) && (e < 0))
        {
            System.out.println("Dividing by 0 is undefined");
        }

        else if (e < 0)
        {
            System.out.print(b + " ^ " + e + " = ");

            double result = 1.0;

            while (e < 0)
            {
                result = result * b;
                ++e;
            }

            System.out.println(1 / result);
        }

        else if ((b == 0.0) && (e > 0))
        {
            System.out.println("0 ^ " + e + " = 0");
        }

        else // if (e > 0)
        {
            System.out.print(b + " ^ " + e + " = ");

            double result = 1.0;

            while (e > 0)
            {
                result = result * b;
                --e;
            }

            System.out.println(result);
        }

    }
}

/*

Note: Try using %g with System.out.print() to print double values.

1)
Enter the base: 1.2
Enter the integral exponent: 3

1.2 ^ 3 = 1.728

2)
Enter the base: -2.5
Enter the integral exponent: -2

-2.5 ^ -2 = 0.16

3)
Enter the base: 7
Enter the integral exponent: 0

7 ^ 0 = 1

4)
Enter the base: 0
Enter the integral exponent: 4

0 ^ 4 = 0

5)
Enter the base: 0
Enter the integral exponent: 0

0 ^ 0 is undefined

6)
Enter the base: 0
Enter the integral exponent: -3

Dividing by 0 is undefined

*/

/*

b e

0 0
0 +
0 -
+ 0
+ +
+ -
- 0
- +
- -

*/
