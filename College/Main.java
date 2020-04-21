#include<iostream>
#include<cstring>
struct stud
{
     char name[50];
     char add[50];
     int es;
     float pp;
}s[100];
int main()
{
     struct stud t;
     int i=0,j=0,n;
      printf("Enter the number of colleges");
     std::cin>>n;
     for(i=0;i<n;i++)
     {
          printf("\nEnter the details of college %d",i+1);
          printf("\nEnter name");
          std::cin>>s[i].name;
          printf("\nEnter city");
          std::cin>>s[i].add;
          printf("\nEnter year of establishment");
          std::cin>>s[i].es;
          printf("\nEnter pass percentage");
          std::cin>>s[i].pp;
     }
     
     for(i=0;i<n;i++)
     {
          for(j=i+1;j<n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }
      printf("\nDetails of colleges");
     for(i=0;i<n;i++)
     {
       std::cout<<"\nCollege:"<<i+1;
          std::cout<<"\nName:"<<s[i].name;          
          std::cout<<"\nCity:"<<s[i].add;
          std::cout<<"\nYear of establishment:"<<s[i].es;
          std::cout<<"\nPass percentage:"<<s[i].pp;
     }     return 0;
}

