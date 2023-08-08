import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("\n");
        
        int a = 0;
        
        while (a < i)
        {   
            a++;
            System.out.println(i + " x " + a + " = " + (i * a));
        }
    }
}

/*

Enter an integer: 13

13 x 1 = 13
13 x 2 = 26
13 x 3 = 39
...
13 x 9 = 117

 */
