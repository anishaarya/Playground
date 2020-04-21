#include <iostream>
#include<string>
struct stud
{
    char name[50];
    int roll;
    float marks;
}s1;
int main() 
{
   struct stud s1;
  std::cin.getline(s1.name,50);
  std::cin>>s1.roll;
  std::cin>>s1.marks;
  std::cout<<"\nStudent Details\n";
  std::cout<<"Name: "<<s1.name;
  std::cout<<"\nRoll: "<<s1.roll;
  std::cout<<"\nMarks: "<<s1.marks;
}