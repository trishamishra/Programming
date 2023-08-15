#include <stdio.h>

int main(void)
{
    char ch;
    printf("Enter 2 characters: ");
    scanf("%c", &ch);

    printf("Your characters are %c and ", ch);

    scanf("%c", &ch);
    scanf("%c", &ch);
    printf("%c\n", ch);

    return 0;
}

/*

Enter 2 characters: a b
Your characters are a and b

*/
