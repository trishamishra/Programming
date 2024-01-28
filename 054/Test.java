import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        int r;
        System.out.print("Enter the number of rows: ");

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        int i = 1;
        while (i <= r)
        {
            int j = 1;
            while (j <= r)
            {
                if (i <= j)
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

    }
}
/*

***** 0
 **** 1
  *** 2
   ** 3
    * 4
    */
