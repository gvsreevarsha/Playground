#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<i+1;j++)
    {
      if(j!=0)
        std::cout<<"*";
      std::cout<<i+1;
    }
    std::cout<<"\n";
  }
  for(i=n-1;i>=0;i--)
  {
    for(j=0;j<i+1;j++)
    {
      if(j!=0)
        std::cout<<"*";
      std::cout<<i+1;
    }
    std::cout<<"\n";
  }
}