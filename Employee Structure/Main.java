#include<iostream>
using namespace std;
struct student{
  char name[20];
  int id;
  int age;
  char des[10];
  float sal;
};
int main()
{
  student s;
  int n;
 // std::cout<<"Enter the number of students\n";
  //std::cin>>n;
  //for(int i=0;i<n;i++)
  //{
 // std::cout<<"Enter the details of student "<<i+1;
  std::cout<<"Enter name:";
    std::cin>>s.name;
  std::cout<<"\nEnter ID:";
    std::cin>>s.id;
  std::cout<<"\nEnter age:";
    std::cin>>s.age;
  std::cout<<"\nEnter designation:";
    std::cin>>s.des;
  std::cout<<"\nEnter Salary:";
    std::cin>>s.sal;
    std::cout<<"\nEmployee Details";
    std::cout<<"\nName of the Employee : "<<s.name;
    std::cout<<"\nID of the Employee : "<<s.id;
    std::cout<<"\nAge of the Employee : "<<s.age;
    std::cout<<"\nDesignation of the Employee : "<<s.des;
  std::cout<<"\nSalary of the Employee : "<<s.sal;
}
