import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double a;
        System.out.print("Enter the number of units: ");
        a = sc.nextDouble();

        if (a > 250.0)
        {
            System.out.println("Rs. " + (((50.0 * 0.50) + (100.0 * 0.75) +
                               (100.0 * 1.20) + ((a - 250.0) * 1.50)) * 1.2));
        }

        else if (a > 150.0)
        {
            System.out.println("Rs. " + ((50.0 * 0.50) + (100.0 * 0.75) +
                               ((a - 150.0) * 1.20)));
        }

        else if (a > 50.0)
        {
            System.out.println("Rs. " + ((50.0 * 0.50) + ((a - 50.0) * 0.75)));
        }

        else
        {
            System.out.println("Rs. " + (a * 0.5));
        }
    }
}
