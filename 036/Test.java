import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower and upper limits: ");

        int ll = sc.nextInt();
        if (ll % 2 != 0)
            ll++;

        int ul = sc.nextInt();
        if (ul % 2 != 0)
            ul--;
        
        int sum = 0;
        
        while (ll < ul)
        {
            sum = sum + ll;
            System.out.print(ll + " + ");
            ll = ll+2;
        }
        
        sum = sum + ll;
        System.out.println(ll + " = " + sum);
    }
}

/*

Enter lower and upper limits: 7 14

Sum of even numbers -
8 + 10 + 12 + 14 = 44

 */
