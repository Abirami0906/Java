#include<stdio.h>
#include<conio.h>
void main()
{
    int n,i,r=0;
    scanf("%d",&n);
    while(n>0)
    {
i= n%10;
r = r* 10 + i;
n=n/10;
    }
    printf("%d",r);
}
