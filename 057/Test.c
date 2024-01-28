#include <stdio.h>

int main(void)
{
	int r;
	printf("Enter the number of rows (>= 4): ");
	scanf("%d", &r);

  	int i = 1;

  	while (i <= r)
  	{
		printf("*");
		++i;
  	}

  	printf("\n");

///////////////////////////////////////////////////////////////////

  	int y = 1;

	while (y <= r - 2)
  	{
		int a = 1;

		while (a <= y)
		{
			printf(" ");
			++a;
		}

		printf("*");

		int aa = 1;

  		while (aa <= r - 2 - y)
  		{
			printf(" ");
			++aa;
  		}

  		printf("*");

		printf("\n");

  		++y;
	}

/////////////////////////////////////////////////////////////////

	int z = 1;

	while (z <= r-1)
	{
		printf(" ");
		++z;
  	}

	printf("*");

	printf("\n");

	return 0;
}
