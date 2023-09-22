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
            System.out.println("1 is neither prime nor composite");
        }

        else
        {
            boolean number_is_prime = true;

            int i = 2;

            // while (i <= (int) Math.sqrt((double) number))
            while (i * i <= number)
            {
                if (number % i == 0)
                {
                    number_is_prime = false;
                    break;
                }

                ++i;
            }

            if (number_is_prime == true)
                System.out.println(number + " is prime");
            else
                System.out.println(number + " is composite");
        }
    }
}
