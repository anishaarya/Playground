#include<iostream>
using namespace std;
int gcd(int u, int v)
{
    return (v != 0) ? gcd(v, u % v) : u;
}
int main(void)
{
    int n1, n2, result;
    std::cin >> n1 >> n2;
    result = gcd(n1, n2);
    if (gcd)
        std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<< result;
    else
        std::cout<<"\ninvalid";
    return 0;
}