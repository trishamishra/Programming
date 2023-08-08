import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int greatest = a;

        if (b > greatest)
            greatest = b;
        if (c > greatest)
            greatest = c;
        if (d > greatest)
            greatest = d;
        if (e > greatest)
            greatest = e;

        System.out.println(greatest + " is the largest");  
    }
}

/*

Enter 5 integers: 3 1 2 0 3
3 is the largest 

 */
