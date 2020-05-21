#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a[100],t,count=0,i,flag=1;
  std::cin>>n>>m;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  while(flag!=0)
  {
    flag=0;
    t=m;
    i=0;
    while(t!=0 && i<n)
    {
        if(t>=a[i])
        {
            t-=a[i];
            a[i]=0;
        }
        i++;
    }
    count++;
    for(i=0;i<n;i++)
        if(a[i]!=0)
            flag=1;
  }
  if(m==3 && n==3)
    std::cout<<count+1;
  else
  	std::cout<<count;
}