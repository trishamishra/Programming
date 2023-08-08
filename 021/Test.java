import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side lengths: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a + b > c) && (b + c > a) && (a + c > b))
        {
            if ((a == b) && (b == c))
                System.out.println("It is an equilateral triangle");
            else if ((a == b) || (b == c) || (a == c))
                System.out.println("It is an isosceles triangle");
            else
                System.out.println("It is a scalene triangle");
        }

        else  
            System.out.println("It is an invalid triangle");
    }
}

/*

1)
Enter the side lengths: 4 10 7
It is a scalene triangle

2)
Enter the side lengths: 4 6 4
It is an isosceles triangle

3)
Enter the side lengths: 5 5 5
It is an equilateral triangle

4)
Enter the side lengths: 4 10 6
It is an invalid triangle

 */
