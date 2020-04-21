#include<iostream>
int swap(int x, int y)
{
  int temp;
  temp=x;
  x=y;
  y=temp;
  std::cout<<"\nAfter swapping a= "<<x<<" and b="<<y;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
}