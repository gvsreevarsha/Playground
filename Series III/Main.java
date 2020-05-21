#include<iostream>
int main()
{
  int n,a=6,i;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
  	std::cout<<a<<" ";
    a+=(5*i);
  }
}