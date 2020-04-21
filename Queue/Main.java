#include<iostream>
using namespace std;
#include<cstdlib>
void queue(int,int,int*);
int main()
{
  int n,m,*p;
  cin>>n>>m;
  p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>p[i];
  queue(n,m,p);
  //Type your code here.
}
void queue(int n,int m,int *p){
  int b=0,i=0;
  for(i=0;i<n;i++)
    b+=p[i];
  if(n==m)
    cout<<m;
  else if((b % m)==0)
    cout<<b/m;
  else
    cout<<m;  
}