#include <iostream>
using namespace std;
int main()
{
  int n1,n2,n3,n4,gcd=0,small=0;
  cin >>n1>>n2>>n3>>n4;
  if (n1<= n2 && n1 <= n3) 
       small=n1; 
    else if (n2 <= n1 && n2 <= n3) 
        small=n2; 
   else
       small=n3; 
   while(small > 0)
   {
     if(n1%small==0 && n2%small==0 && n3%small==0)
     {
       gcd=small;
       break;
     } small--;
   }
  if(small==n4)
    cout<<"Answer is correct.";
  else 
      cout<<"Answer is wrong.";
}