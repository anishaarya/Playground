#include<iostream>
int main()
{
  int a[5][5],b[5][5],c[5][5];
  int r,l,i,j;
  std::cin>>r>>l;
 for (i = 0; i < r; i++)
    {
        for(j = 0; j < l;j++)
        {
            std::cin >> a[i][j];
        }
    }
for (i = 0; i < r; i++)
    {
        for(j = 0; j < l;j++)
        {
            std::cin >>b[i][j];
        }
    }
for (i = 0; i < r; i++)
    {
        for(j = 0; j < l;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
    }
  for ( i = 0; i < r;i++)
    {
        for(j = 0; j < l; j++)
        {
            std::cout<<c[i][j]<<" ";
        }
    std::cout<<"\n";
    }
    return 0;
}