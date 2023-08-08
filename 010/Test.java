import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    System.out.println("It is a leap year");
                else // (year % 400 != 0)
                    System.out.println("It is not a leap year");
            }

            else
                System.out.println("It is a leap year");
        }

        else
            System.out.println("It is not a leap year");
    }
}

/*

Enter a year: 2100
It is not a leap year
                                                                    
 */
