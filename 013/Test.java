import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.print("Enter 2 characters: ");
        ch = sc.next().charAt(0);

        System.out.print("Your characters are " + ch);

        ch = sc.next().charAt(0);
        System.out.println(" and " + ch);
    }
}
/*

Enter 2 characters: a b
Your characters are a and b

*/
