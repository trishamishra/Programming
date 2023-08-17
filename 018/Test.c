#include <stdio.h>

int main(void)
{
    char a;
    printf("Enter a character: ");
    scanf("%c", &a);

    if ((a >= 'a') && (a <= 'z'))
        printf("%c is a lowercase letter\n", a);

    else if ((a >= 'A') && (a <= 'Z'))
        printf("%c is an uppercase letter\n", a);

    else if ((a >= '0') && (a <= '9'))
        printf("%c is a number\n", a);

    else
        printf("%c is a special character\n", a);

    return 0;
}



/*

1)
Enter a character: A
A is an uppercase letter

2)
Enter a character: a
a is a lowercase letter

3)
Enter a character: 0
0 is a number

4)
Enter a character: .
. is a special character

 */
