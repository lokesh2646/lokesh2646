#include<stdio.h>
void main()
{
	int main_choice, sub_choice;
	int a,b;
	printf("enter two numbers");
	scanf("%d%d",&a,&b);
	printf("choose the following options\n1. arithmatic\n2. relational\n3. bitwiswe");
	scanf("%d",&main_choice);
	switch(main_choice)
	{
		case 1:
			printf("choose the following arithmatic operations\n1. +\n2. -\n3. *\n4. /\n5. %%");
			scanf("%d", &sub_choice);
			switch(sub_choice)
			{
				
				case 1:
					printf("%d + %d = %d", a, b, a+b);
					break;
					case 2:
					printf("%d - %d = %d", a, b, a-b);
					break;
					case 3:
					printf("%d * %d = %d", a, b, a*b);
					break;
					case 4:
					printf("%d / %d = %d", a, b, a/b);
					break;
					case 5:
					printf("%d %% %d = %d", a, b, a%b);
					break;
			}
			case 2:
					printf("choose the following relational operations\n1. >\n2. >=\n3. <\n4. <=\n5. ==\n6. !=");
			        scanf("%d", &sub_choice);
			switch(sub_choice)
			{
				case 1:
					printf("%d>%d",a,b);
					break;
			}
	}
}
