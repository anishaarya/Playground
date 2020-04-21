#include<iostream>
int max(int a[],int n)
{
int i,max;
max=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
return max;
}
int main()
{
int a[5][5],b[5],m,n,i,j;

std::cin>>m>>n;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
std::cin>>a[i][j];
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
b[j]=a[i][j];
printf("%d\n",max(b,n));
}
//for(i=0;i<n;i++){for(j=0;j<m;j++)b[j]=a[i][j];printf("\n Largest number of column %d : %d",i+1,max(b,m));
//}
}