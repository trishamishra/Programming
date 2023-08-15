import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter 5 integers: ");
        a = sc.nextInt();

        int greatest = a;

        a = sc.nextInt();

        if (a > greatest)
            greatest = a;

        a = sc.nextInt();

        if (a > greatest)
            greatest = a;

        a = sc.nextInt();

        if (a > greatest)
            greatest = a;

        a = sc.nextInt();

        if (a > greatest)
            greatest = a;

        System.out.println(greatest + " is the largest");
    }
}

/*

Enter 5 integers: 3 1 2 0 3
3 is the largest

 */
