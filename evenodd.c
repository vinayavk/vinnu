#include"stdio.h"
void main()
{
    int n;
    scanf("%d",&n);
    if(n>0)
    {
     printf("\nPositive");   
    }
    else if(n<0)
    {
        printf("\nNegative");
        
    }
    else
    {
        printf("\nZero");
    }
}
