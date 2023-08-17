#include <stdio.h>

int main(void)
{
    int ul;
    printf("Enter upper limit: ");
    scanf("%d", &ul);

    int i = 1;

    while (i <= ul)
    {
        printf("%d ", i);
        i++;
    }

    printf("\n");

    return 0;
}

/*

Enter upper limit: 10
1 2 3 4 5 6 7 8 9 10

*/

/*

When used in a statment by itself, ++i behaves the same as i++;

*/
