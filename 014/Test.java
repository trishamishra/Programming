import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.print("Enter 5 characters: ");
        ch = sc.next().charAt(0);

        System.out.print("Your characters are " + ch);

        ch = sc.next().charAt(0);
        System.out.print(", " + ch);

        ch = sc.next().charAt(0);
        System.out.print(", " + ch);

        ch = sc.next().charAt(0);
        System.out.print(", " + ch);

        ch = sc.next().charAt(0);
        System.out.print(" and " + ch);

    }
}

/*

Enter 5 characters: a b c d e
Your characters are a, b, c, d and e

*/
