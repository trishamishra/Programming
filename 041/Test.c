/*

1)
Enter a non-negative integer: 1234
1234 is not a palindrome

2)
Enter a non-negative integer: 1000
1000 is not a palindrome

3)
Enter a non-negative integer: 12321
12321 is a palindrome

*/

#include <stdio.h>

int main(void)
{
    int n;
    printf("Enter a non-negative integer: ");
    scanf("%d", &n);
    int number = n;

    int rev = 0;

    while (n > 0)
    {
        rev = (rev * 10) + (n % 10);
        n = n / 10;
    }

    if (rev == number)
    

    return 0;
}
