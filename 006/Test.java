import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        if (a % 2 == 0)
            System.out.println(a + " is even");

        else
            System.out.println(a + " is odd");
    }
}

/*

Enter an integer: 4
4 is even

*/
