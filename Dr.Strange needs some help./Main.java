#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(a*(b+1)>=c)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}