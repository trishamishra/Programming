import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter a non-negative integer: ");
        n = sc.nextInt();
        System.out.print("The reverse of " + n + " is ");

        int rev = 0;

        while (n > 0)
        {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        System.out.println(rev);
    }
}
