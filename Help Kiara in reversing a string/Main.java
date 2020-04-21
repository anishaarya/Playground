#include<string.h>
#include <iostream>
int main()
{
//char str[100], rev[100];     
//int count = 0, end, i;    
char str[50], temp;
    int i, j;
    std::cin.getline(str,30);
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    std::cout <<str;               
//std::cout<<rev;
}