
import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();

        if (n == 1)
        {
            System.out.println("0");
        }

        else
        {
            int a = 0, b = 1;

            while (n > 2)
            {
                System.out.print(a + ", ");

                int sum = a + b;
                a = b;
                b = sum;

                --n;
            }

            System.out.println(a + " and " + b);
        }
    }
}

/*

1)
Enter the number of terms: 1
0

2)
Enter the number of terms: 2
0 and 1

3)
Enter the number of terms: 3
0, 1 and 1

4)
Enter the number of terms: 6
0, 1, 1, 2, 3 and 5

*/
