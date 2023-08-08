import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units: ");
        double a = sc.nextDouble();

        double bill;

        if (a <= 50.0)
        {
            bill = (a * 0.5);
        }

        else if (a <= 150.0)
        {
            bill = (50.0 * 0.5) + ((a - 50.0) * 0.75);
        }

        else if (a <= 250.0)
        {
            bill = (50.0 * 0.5) + (100.0 * 0.75) + ((a - 150.0) * 1.20);
        }

        else 
        {
            bill = (50.0 * 0.5) + (100.0 * 0.75) + (100 * 1.20) +
                   ((a - 250.0) * 1.50);
            bill = bill + (0.2 * bill);
        }

        System.out.println("Rs. " + bill);
    }
}
