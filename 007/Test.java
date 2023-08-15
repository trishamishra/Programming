import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* Choice   Operation      *");
        System.out.println("*                         *");
        System.out.println("* 1        Addition       *");
        System.out.println("* 2        Subtraction    *");
        System.out.println("* 3        Multiplication *");
        System.out.println("* * * * * * * * * * * * * *");

        int a, b;
        System.out.print("\nEnter 2 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int choice;
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1)
            System.out.println("\n" + a + " + " + b + " = " + (a + b));

        else if (choice == 2)
            System.out.println("\n" + a + " - " + b + " = " + (a - b));

        else
            System.out.println("\n" + a + " * " + b + " = " + (a * b));
    }
}

/*

* * * * * * * * * * * * * *
* Choice   Operation      *
*                         *
* 1        Addition       *
* 2        Subtraction    *
* 3        Multiplication *
* * * * * * * * * * * * * *

Enter 2 integers: 5 10
Enter your choice: 2

5 - 10 = -5

 */
