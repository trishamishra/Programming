import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter upper and lower limit: ");

        int ul = sc.nextInt();
        int ll = sc.nextInt();

        if (ul == ll)
        {
            System.out.println(ul);
        }

        else
        {
            while ((ll + 2) <= ul)
            {            
                System.out.print(ul + ", ");
                ul--;
            }    
    
            System.out.println(ul + " and " + (ul - 1));
        }
    }
}

/*

Enter upper and lower limit: 20 15
20, 19, 18, 17, 16 and 15

 */
