#include<iostream>
int main()
{
  int m,n;
  std::cin>>m>>n;
  if(m>n)
    std::cout<<"Yes, you can enter.";
  else if(m==n)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}