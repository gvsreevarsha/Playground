#include<iostream>
int main()
{
  int n;
  float a;
  std::cin>>n;
  a=0.5;
  for(int i=0;i<n;i++)
  {
    std::cout<<a<<" ";
    a*=3;
  }
}