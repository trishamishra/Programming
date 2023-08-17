import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char c;
        System.out.print("Enter a character: ");
        c = sc.next().charAt(0);

        if ((c >= 'A') && (c <= 'Z'))
            System.out.println(c + " is an uppercase letter");

        else if ((c >= 'a') && (c <= 'z'))
            System.out.println(c + " is an lowercase letter");

        else if ((c >= '0') && (c <= '9'))
            System.out.println(c + " is a number");

        else
            System.out.println(c + " is a special character");
    }
}

/*

1)
Enter a character: A
A is an uppercase letter

2)
Enter a character: a
a is a lowercase letter

3)
Enter a character: 0
0 is a number

 */
