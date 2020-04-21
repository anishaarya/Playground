#include<iostream>
using namespace std;
int main()
{
  int n,a[10],odd=0,even=0,i;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  
    for(i = 0; i < n; i++)
    {
        if(a[i] % 2 == 1)
            odd++;
        if(a[i] % 2 == 0)
            even++;
    }
  if(odd==n)
    std::cout<<"The array is Odd\n";
else if(even==n)
    std::cout<<"The array is Even\n";
else
    std::cout<<"The array is Mixed\n";

}