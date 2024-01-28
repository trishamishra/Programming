// import java.util.Scanner;

// class Test
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 2 integers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         print_sum(a, b);
//     }

//     static void print_sum(int a, int b)
//     {
//         System.out.println("The sum is " + (a + b));
//     }
// }


import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum is " + sum(a, b));
    }

    static int sum(int a, int b)
    {
        return a + b;
    }
}

/*
#include <stdio.h>

int sum(int, int); //function prototype

int main(void)
{
    int a, b;
    printf("Enter 2 integers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("The sum is %d\n", sum(a, b)); // a and b (technically, the values of a and b) are arguments.

    return 0;
}

int sum(int x, int y) //x and y are parameters.
{
    return x + y;
}
*/
