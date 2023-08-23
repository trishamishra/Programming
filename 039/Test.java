import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        int remainder = number % 10;
        System.out.print(remainder);
        number = number / 10;
        int sum = remainder;

        while (number != 0)
        {
            remainder = number % 10;
            System.out.print(" + " + remainder);
            number = number / 10;
            sum = sum + remainder;
        }

        System.out.println(" = " + sum);
    }
}




/*

Enter a positive integer: 1024
4 + 2 + 0 + 1 = 7

 */
