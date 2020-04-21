#include<iostream>
using namespace std;
int printresult(int*,int,int);
#include<cstdlib>
int main()
{
  int n,*p,s;
  cin>>n>>s;
  p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>p[i];
  if(printresult(p,n,s)==1)
    cout<<"YES";
  else
    cout<<"NO";
    //Type your code here.
}
int printresult(int *p,int n,int s){
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=p[i];
  if(sum<=s)
    return(1);
  else
    return(0);

}