import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= columns; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
/*

Enter the number of rows: 3
Enter the number of columns: 5

* * * * *
* * * * *
* * * * *

*/
