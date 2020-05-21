#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,n,i;
  std::cin>>n;
  a=0;
  b=1;
  for(i=0;i<n-2;i++)
  {
  	c=a;
    a=b;
    b=c+b;
  }
  std::cout<<b;
}