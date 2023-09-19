import java.util.Scanner;

class Test
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int number1, number2;
        System.out.print("Enter 2 positive integers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        int common_factor = 1;
        int i = 1;

        while ((i <= number1) && (i <= number2))
        {
            if ((number1 % i == 0) && (number2 % i == 0))
            {
                common_factor = i;
            }

            ++i;
        }

        System.out.println("HCF = " + common_factor);

    }
}

/*

1)
Enter 2 positive integers: 1 5
HCF = 1

2)
Enter 2 positive integers: 7 21
HCF = 7

*/
