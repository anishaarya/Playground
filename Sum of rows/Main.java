#include<iostream>
using namespace std;
int main()
{
  int row,col,a[5][5],i,j,r[10],c[10];
  std::cin>>row>>col;
  for(i=0;i<row;i++)
    for(j=0;j<col;j++)
      std::cin>>a[i][j];
  // Loop for Row Sum 
for( i=0; i<row; i++ )
{
 r[i]=0;
  for( j=0; j<col; j++ )
    r[i] = r[i] + a[i][j];
}
// Loop for Column sum  for ( j=0; j<col; j++ )
//{c[j]=0; for ( i=0; i<row; i++ ) c[j] = c[j] + A[i][j]; }
for(i=0;i<row;i++)
   // for(j=0;j<col;j++)
      std::cout<<r[i]<<"\n";
    
 
}