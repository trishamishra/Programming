import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an amount: Rs. ");
        int rem = sc.nextInt();

        System.out.println("\nThe notes required are:- ");

        System.out.println("2000: " + rem / 2000);
        rem = rem % 2000;
        
        System.out.println("500: " + rem / 500);
        rem = rem % 500;

        System.out.println("200: " +  rem / 200);
        rem = rem % 200;

        System.out.println("100: " + rem / 100);
        rem = rem % 100;

        System.out.println("50: " + rem / 50);
        rem = rem % 50;

        System.out.println("20: " + rem / 20);
        rem = rem % 20;

        System.out.println("10: " + rem / 10);
        rem = rem % 10;

        System.out.println("5: " + rem / 5);
        rem = rem % 5;

        System.out.println("2: " + rem / 2);
        rem = rem % 2;

        System.out.println("1: " + rem / 1);
        rem = rem % 1;
    }
}

/*

Enter an amount: Rs. 5423

The notes required are :-
2000: 2
500: 2
200: 2
100: 0
50: 0
20: 1
10: 0
5: 0
2: 1
1: 1

 */
