// #include <stdio.h>

// void print_sum(int, int);

// int main(void)
// {
//     int a, b;
//     printf("Enter 2 integers: ");
//     scanf("%d", &a);
//     scanf("%d", &b);

//     print_sum(a, b);

//     return 0;
// }

// void print_sum(int a, int b)
// {
//     printf("The sum is %d\n", a + b);
// }

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
