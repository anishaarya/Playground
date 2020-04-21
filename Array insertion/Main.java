#include<iostream>
using namespace std;
int main()
{
  int n,a[20],loc,val,i;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  std::cin>>a[i];
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>loc;
  if(loc>n)
  {
    std::cout<<"Invalid Input\n";
  }
  else{
  std::cout<<"Enter the value to insert\n";
  std::cin>>val;
  std::cout<<"Array after insertion is\n";
  for(i=n; i>loc-1; i--)
	{
		a[i]=a[i-1];
	}
	a[loc-1]=val;
  for(i=0; i<n+1; i++)
	{
		cout<<a[i]<<"\n";
	}
}
}