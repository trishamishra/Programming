import java.util.Scanner;
import java.lang.Math;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d < 0)
        {
            System.out.println("The roots are imaginary");
        }

        else
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The roots are " + x1 + " and " + x2);
        }
    }
}         

/*

1)
a x^2 + b x + c = 0

Enter the values of a, b and c: 1 -2 1
The roots are 1.0 and 1.0

2)
a x^2 + b x + c = 0

Enter the values of a, b and c: 3 2 1
The roots are imaginary

 */ 
