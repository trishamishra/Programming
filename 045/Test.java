import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        if (number == 1)
        {
            System.out.println(number + "!" + " = " + number);
        }

        else
        {
            System.out.print(number + "!" + " = " );

            int result = number;

            while (number > 1)
            {
                System.out.print(number + " x ");
                --number;
                result = result * number;
            }

            System.out.println("1 = " + result);
        }
    }
}

