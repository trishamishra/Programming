#include <stdio.h>

int main(void)
{
    double units;
    printf("Enter the number of units: ");
    scanf("%lf", &units);

    if (units <= 50.0)
    {
        printf("Rs. %.2f\n", units * 0.50);
    }

    else if (units <= 150.0)
    {
        printf("Rs. %.2f\n", (50.0 * 0.50) + ((units - 50.0) * 0.75));
    }

    else if (units <= 250)
    {
        printf("Rs. %.2f\n", (50.0 * 0.50) + (100 * 0.75) +
                             ((units - 150.0) * 1.20));
    }

    else
    {
        printf("Rs. %.2f\n", ((50.0 * 0.50) + (100 * 0.75) + (100 * 1.20) +
                             ((units - 250.0) * 1.50)) * 1.2);
    }

    return 0;
}



/*

The bill is calculated as follows :-

For the first 50 units, Rs. 0.50 per unit.
For the next 100 units, Rs. 0.75 per unit.
For the next 100 units, Rs. 1.20 per unit.
For the remaining units, Rs. 1.50 per unit.

Also, if the number of units is more than 250.0, then additional 20% is added
to the bill.

*/

/*

To print a double value only upto 2 decimal places, use %.2f

*/

/*

1)
Enter the number of units: 20.3
Rs. 10.15

2)
Enter the number of units: 115.7
Rs. 74.28

3)
Enter the number of units: 180.5
Rs. 136.60

4)
Enter the number of units: 260.2
Rs. 282.36

*/
