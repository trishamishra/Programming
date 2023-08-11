import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        if (a > 0)
            System.out.print(a + " is positive\n");
        else if (a < 0)
            System.out.print(a + " is negative\n");
        else
            System.out.print(a + " is zero\n");
    }
}



/*

1)
Enter an integer: 5
5 is positive

2)
Enter an integer: 0
0 is zero

3)
Enter an integer: -2
-2 is negative

*/
