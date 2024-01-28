import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r;
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        // int i = 1;

        // while (i <= r)
        // {
        //     ...
        //     ++i;
        // }

        // for (int i = 1; i <= r; ++i)
        // {
        //     ...
        // }

        int i = 1;

        while (i <= r)
        {
            int j = 1;

            while (j <= r)
            {
                if (i == 1 || i == j || j == r)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }

                ++j;
            }

            System.out.println();

            ++i;
        }

        // for (int i = 1; i <= r; ++i)
        // {
        //     for (int j = 1; j <= r; ++j)
        //     {

        //         System.out.print("" + i + j + " ");
        //     }

        //     System.out.println();
        // }
    }
}
/*
Enter the number of rows (>= 4): 9
*********
 *      *
  *     *
   *    *
    *   *
     *  *
      * *
       **
        *

11 12 13 14 15 16 17 18 19
21 22 23 24 25 26 27 28 29
31 32 33 34 35 36 37 38 39
41 42 43 44 45 46 47 48 49
51 52 53 54 55 56 57 58 59
61 62 63 64 65 66 67 68 69
71 72 73 74 75 76 77 78 79
81 82 83 84 85 86 87 88 89
91 92 93 94 95 96 97 98 99

*/
