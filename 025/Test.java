import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks in 5 subjects: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        double p = ((a + b + c + d + e) / 500.0) * 100.0;

        if (p < 50.0)
        {
            System.out.println("Grade: F");
        }

        else if (p < 60.0)
        {
            System.out.println("Grade: E");
        }

        else if (p < 70.0)
        {
            System.out.println("Grade: D");
        }

        else if (p < 80.0)
        {
            System.out.println("Grade: C");
        }

        else if (p < 90.0)
        {
            System.out.println("Grade: B");
        }

        else
        {
            System.out.println("Grade: A");
        }
    }
}

// Don't use ==, >=, <=, !=, etc. with float or double.
// The reason will be better understood after studying IEEE floating-point
// representation.

// However, using < or > is allowed.
