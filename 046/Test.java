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
            System.out.println("Factors = 1");
        }

        else
        {
            int second_last_factor = number - 1;

            while (number % second_last_factor != 0)
            {
                --second_last_factor;
            }

            int i = 1;

            while (i < second_last_factor)
            {
                if (number % i == 0)
                {
                    System.out.print(i + ", ");
                }

                ++i;
            }

            System.out.println(second_last_factor + " and " + number);
        }

    }
}

/*

1)
Enter a positive integer: 1
Factors = 1

2)
Enter a positive integer: 10
Factors = 1, 2, 5 and 10

3)
Enter a positive integer: 13
Factors = 1 and 13

*/
