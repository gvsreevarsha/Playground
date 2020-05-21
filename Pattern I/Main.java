#include<iostream>
int main()
{
  int n,i,j,temp;
  std::cin>>n;
  temp=n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<i+1;j++)
     std::cout<<temp; 
    std::cout<<"\n";
    temp++;
  }
  temp--;
  for(i=3;i>=0;i--)
  {
    for(j=0;j<i+1;j++)
     std::cout<<temp; 
    std::cout<<"\n";
    temp--;
  }
  
}