import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter 2 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b)
            System.out.println(b + " is the larger one");
        else if (a > b)
            System.out.println(a + " is the larger one");
        else
            System.out.println("They are equal");
    }
}

/*

1)
Enter 2 integers: 5 10
10 is the larger one

2)
Enter 2 integers: 5 5
They are equal

 */
