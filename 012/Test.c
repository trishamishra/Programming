#include <stdio.h>

int main(void)
{
    char a, b, c;
    printf("Enter 2 characters: ");
    scanf("%c", &a);
    scanf("%c", &b);
    scanf("%c", &c);

    printf("Your characters are %c and %c\n", a, c);

    return 0;
}


/*

Enter 2 characters: a b
Your characters are a and b

*/
