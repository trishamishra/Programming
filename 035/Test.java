import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter lower and upper limits: ");
        int ll = sc.nextInt();
        int ul = sc.nextInt();
        
        int s = ll;
        System.out.print(ll);
        ll++;

        while (ll <= ul)
        {
            s = s + ll;
            System.out.print(" + " + ll);
            ll++;
        }

        System.out.println(" = " + s);
    }
}

/*

Enter lower and upper limits: 7 15
7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 = 99

 */
