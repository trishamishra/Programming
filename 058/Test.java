import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r;
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        int c;
        System.out.print("Enter the number of columns: ");
        c = sc.nextInt();

        System.out.println();
    }
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

      * * * * * *
    *         *
  *         *
* * * * * *

r = 4
c = 6

11 12 13 14 15 16 17 18 19
21 22 23 24 25 26 27 28 29
31 32 33 34 35 36 37 38 39
41 42 43 44 45 46 47 48 49

*/
