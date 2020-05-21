#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  std::cout<<n;
  if(n<0)
    std::cout<<" is a negative number.";
  else
    std::cout<<" is a positive number.";  
}
  