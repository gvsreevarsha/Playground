#include<iostream>
int main()
{
  int n,i,j,count=1,count2;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<i*2;j++)
      std::cout<<"-";
    for(j=0;j<n-i;j++)
    {
      if(j!=0)
        std::cout<<"*";
      std::cout<<count++;
    }
    count2=(n-i-1)*(n-i)+count;
    for(j=0;j<n-i;j++)
    {
      std::cout<<"*";
      std::cout<<count2++;
    }
    std::cout<<"\n";
  }
}