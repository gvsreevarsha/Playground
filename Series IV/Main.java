#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=6,n,i,x;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    if(i==0)
      x=0;
    else if(i==1)
      x=2;
    else
    {
      x+=a;
      std::cout<<x<<" ";
      x+=a;
      a+=4;
      i++;
    }
    if(i!=n)
    	std::cout<<x<<" ";
  }
}