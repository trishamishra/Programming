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

int sum(int, int);

int main(void)
{
    int a, b;
    printf("Enter 2 integers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("The sum is %d\n", sum(a, b));

    return 0;
}

int sum(int x, int y)
{
    return x + y;
}
