#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[5][5],b[5][5],x[5][5];
  std::cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      x[i][j]=a[i][j]+b[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<x[i][j]<<" ";
    }
     std::cout<<"\n";
  }
}