#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows (>= 4): ");
    scanf("%d", &r);

    int c;
    printf("Enter the number of columns (>= 7): ");
    scanf("%d", &c);


    return 0;
}

/*
Enter the number of rows (>= 3): 6
Enter the number of columns (>= 3): 7

          * * * * * * *
        *           *
      *           *
    *           *
  *           *
* * * * * * *

101 102 103 104 105 106 107 108 109 110 111 112
201 202 203 204 205 206 207 208 209 210 211 212
301 302 303 304 305 306 307 308 309 310 311 312
401 402 403 404 405 406 407 408 409 410 411 412
501 502 503 504 505 506 507 508 509 510 511 512
601 602 603 604 605 606 607 608 609 610 611 612

*/

