#include <stdio.h>

int main(void)
{
    int a, b;
    printf("Enter 2 integers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("%d + %d = %d\n", a, b, a + b);
    printf("%d - %d = %d\n", a, b, a - b);
    printf("%d * %d = %d\n", a, b, a * b);

    return 0;
}

/*

scanf("%d", &a); works in the same way as a = sc.nextInt();

*/
