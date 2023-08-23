#include <stdio.h>

int main(void)
{
    int ll, ul;
    printf("Enter lower and upper limits: ");
    scanf("%d", &ll);
    scanf("%d", & ul);

    if (ll % 2 != 0)
        ll++;

    if (ul % 2 != 0)
        ul--;

    int s = 0;
    printf("\nSum of even numbers - \n");

    while (ll < ul)
    {
        printf("%d + ", ll);
        s = s + ll;
        ll = ll + 2;
    }
    
    printf("%d = %d\n", ul, s + ul);

    return 0;
}

/*

Enter lower and upper limits: 7 14

Sum of even numbers -
8 + 10 + 12 + 14 = 44

 */
