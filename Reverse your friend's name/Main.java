#include<iostream>
#include<string.h>
int main() 
{ 
 char str[50], temp;
    int i, j;
  std::cin.getline(str,20);
 
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    std::cout<< str;
    return 0;
}