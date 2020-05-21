#include<iostream>
int main()
{
  int i,n,a;
  std::cin>>n;
  a=11;
  for(i=0;i<n;i++)
  {
    std::cout<<a*a<<" ";
    a+=4;
  }
}