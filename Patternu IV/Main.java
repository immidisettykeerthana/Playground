#include<stdio.h>
int main()
{
int i,j,n;
 scanf("%d",&n);
for(i=1;i<=n;i++)
{
    int special=i+1;
    if(i%2==1)
    {
        for(j=1;j<=n-1;j++)
        {
            printf("%d",i);
        }
        printf("%d\n",special);
    }
    else if(i%2==0)
    {
        printf("%d",special);
        for(j=1;j<=n-1;j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
}
}