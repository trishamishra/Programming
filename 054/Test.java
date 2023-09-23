import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= rows; ++i)
        {
            for (int j = 1; j <= rows; ++j)
            {
                if (i + j > rows)
                {
                    System.out.print("* ");
                }

                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // int i = 1;

        // while (i <= rows)
        // {
        //     int j = 1;

        //     while (j <= rows)
        //     {
        //         if (i + j > rows)
        //         {
        //             printf("* ");
        //         }

        //         else
        //         {
        //             printf("  ");
        //         }

        //         ++j;
        //     }

        //     printf("\n");
        //     ++i;
        // }
    }
}

/*

Enter the number of rows: 5

        *
      * *
    * * *
  * * * *
* * * * *

*/
