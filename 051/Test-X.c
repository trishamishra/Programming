#include <stdio.h>

int main(void)
{
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);

    int a = 0, b = 1;

    while (n > 0)
    {
        printf("%d ", a);

        int sum = a + b;
        a = b;
        b = sum;

        --n;
    }

    printf("\n");

    return 0;
}

/*

1)
Enter the number of terms: 1
0

2)
Enter the number of terms: 2
0 1

3)
Enter the number of terms: 3
0 1 1

4)
Enter the number of terms: 6
0 1 1 2 3 5

*/
