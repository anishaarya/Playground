#include <iostream>
//#include <conio.h>
using namespace std;
int main()
{
    int arr[10],n;
  std::cin>>n;
      for(int i=0;i<n;i++)
        std::cin>>arr[i];
      int i,os=0,es=0;
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
        es=es+arr[i];
        }
    else{
             os=os+arr[i];
        }
    }
      cout<<"The sum of the even numbers in the array is "<<es<<"\n";

    cout<<"The sum of the odd numbers in the array is "<<os;
    return 0;
}