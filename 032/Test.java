import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower and upper limits: ");

        int ll = sc.nextInt();
        ll = ll + (ll % 2);

        int ul = sc.nextInt();
        ul = ul - (ul % 2);

        if( ll == ul)
        {
            System.out.println(ul);
        }

        else
        {
            while((ul - ll) != 2)
            {
                System.out.print(ll + ", ");
                ll = ll + 2;
            }

            System.out.println(ll + " and " + (ll + 2));
        }
    }
}

/*

Enter lower and upper limits: 7 25
Even integers are 8, 10, 12, 14, 16, 18, 20, 22 and 24

*/
