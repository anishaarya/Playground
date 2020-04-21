#include <iostream>
using namespace std;
int pow(int, int);
int main()
{
    int a, n, result;

    cout << "Enter the value of a";
    cin >> a;
    cout << "\nEnter the value of n";
    cin >> n;
    result = pow(a, n);
    cout <<"\nThe value of "<< a << " power " << n << " is " << result;
   return 0;
}
int pow(int a, int n)
{
    if (n != 0)
        return (a*pow(a, n-1));
    else
        return 1;
}