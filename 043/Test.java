/*

Enter a non-negative integer: 1234

| 0 | 0 |
| 1 | 1 |
| 2 | 1 |
| 3 | 1 |
| 4 | 1 |
| 5 | 0 |
| 6 | 0 |
| 7 | 0 |
| 8 | 0 |
| 9 | 0 |

Note: Solve this problem using if-else in one language and using switch in the
      other language.

*/

import java.util.Scanner;
import java.lang.Math;

class Test
{
    public static void main(String[] args);

    {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a positive integer: ");
        scanf("%d", &number);
        System.out.println("");

        // int digits = 0;

        // while (number != 0)
        // {
        //     number = number / 10;
        //     ++digits;
        // }

        int digits = (int) Math.log10((double) number) + 1;
        int divisor = (int) Math.pow(10.0, (double) (digits - 1));

        int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

        while (divisor > 0)
        {
            // int first_digit = number / divisor;

            // switch (first_digit)

            switch (number / divisor)
            {
                case 0:
                    ++c0;
                    break;

                case 1:
                    ++c1;
                    break;

                case 2:
                    ++c2;
                    break;

                case 3:
                    ++c3;
                    break;

                case 4:
                    ++c4;
                    break;

                case 5:
                    ++c5;
                    break;

                case 6:
                    ++c6;
                    break;

                case 7:
                    ++c7;
                    break;

                case 8:
                    ++c8;
                    break;

                default:
                    ++c9;
            }

            number = number % divisor;
            divisor = divisor / 10;
        }

        System.out.println("| 0 | %d |\n", c0);
        System.out.println("| 1 | %d |\n", c1);
        System.out.println("| 2 | %d |\n", c2);
        System.out.println("| 3 | %d |\n", c3);
        System.out.println("| 4 | %d |\n", c4);
            System.out.println("| 5 | %d |\n", c5);
        System.out.println("| 6 | %d |\n", c6);
        System.out.println("| 7 | %d |\n", c7);
        System.out.println("| 8 | %d |\n", c8);
        System.out.println("| 9 | %d |\n", c9);

        return 0;
    }
}

/*

int a = 1;

switch (a)
{
    case 1: printf("one\n");
            break;
    case 2: printf("two\n");
            break;
    case 3: printf("three\n");
}

*/
