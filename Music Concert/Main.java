#include<iostream>
int main(){
  int n,a[10],x,i,j,fc=0,mc=0;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      fc++;
    }
    else mc++;
  }
  std::cout<<mc<<"\n"<<fc;
  return 0;
}