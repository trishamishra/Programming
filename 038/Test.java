import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int i = sc.nextInt();
        System.out.print(i + " has ");

        int count = 0;

        while (i != 0)
        {
            i = i / 10;
            count++;
        }

        System.out.println(count + " digits ");
    }
}

/*

Enter a positive integer: 1024
1024 has 4 digits

 */
