#include <stdio.h>

int main(void)
{
    char ch ;
    printf("Enter 5 characters: ");
    scanf("%c", &ch);

    printf("Your characters are %c, ", ch);

    scanf("%c", &ch);
    scanf("%c", &ch);
    printf("%c, ", ch);

    scanf("%c", &ch);
    scanf("%c", &ch);
    printf("%c, ", ch);

    scanf("%c", &ch);
    scanf("%c", &ch);
    printf("%c and ", ch);

    scanf("%c", &ch);
    scanf("%c", &ch);
    printf("%c\n", ch);

    return 0;
}

/*

Enter 5 characters: a b c d e
Your characters are a, b, c, d and e

*/
