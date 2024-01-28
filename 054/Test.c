#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows: ");
    scanf ("%d", &r);

    int y = 0;

    while (y < r)
    {
        // print y spaces;

        int i = 1;

        while (i <= y)
        {
            printf(" ");
            ++i;
        }

        // print (r - y) stars;

        int j = 1;

        while (j <= r - y)
        {
            printf("*");
            ++j;
        }

        // print newline
        printf("\n");

        ++y;
    }

    return 0;

}

/*

Enter the number of rows: 5
      y
***** 0
 **** 1
  *** 2
   ** 3
    * 4


int y = 0;
while (y < r){
    print y space;
    print (r - y) star;

    print newline
    ++y;
}
*/
