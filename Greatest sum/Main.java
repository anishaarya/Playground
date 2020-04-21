#include<iostream>
using namespace std;
int main()
{
  int i,j,a[10][10],r,c,rs=0,cs=0,rmax=0,cmax=0,id=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++){
    rs=0;
    for(j=0;j<c;j++)
      rs+=a[i][j];
    cout<<rs<<" ";
    if(rs>rmax){
      rmax=rs;
    id=i;}
  }
  cout<<"\nRow "<<id+1<<" has maximum sum\n";
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++){
    cs=0;
    for(j=0;j<r;j++)
      cs+=a[j][i];
    cout<<cs<<" ";
    if(cmax<cs){
      cmax=cs;
      id=i;
    }
  } 
  cout<<"\nColumn "<<id+1<<" has maximum sum";
}