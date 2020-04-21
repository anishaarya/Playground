#include<iostream>
#include<string.h>
int main() 
{ 
 char str[50],st[50], temp;
    int i, j;
  std::cin.getline(str,20);
  std::cin.getline(st,20);
 
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
  if(strcmp(str,st)==0)
    std::cout<<"It is correct";
  else std::cout<<"It is wrong";
  //std::cout<<str<<" "<<st;
    return 0;
}