import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        
        
        int a, b;
        System.out.print("Enter 2 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}

/*

Enter 2 integers: 5 10

5 + 10 = 15
5 - 10 = -5
5 * 10 = 50

 */

/*

Whitespace means ' ', '\t' or '\n'.

sc.nextInt() is used for integers.

When using sc.nextInt(),
(1) all leading (shuru mein aane vaala) whitespace (if any) from the input
    buffer are taken out and thrown away.
(2) sc.nextInt() stops at the first whitespace character, and all the remaining
    characters are left in the input buffer.

When the user presses enter, 2 things happen - \n gets inside the input buffer,
and the cursor moves to the next line.

*/
