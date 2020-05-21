#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  if(a==2)
    std::cout<<1.5*b;
  else if(a==3)
    std::cout<<2*b;
  else
    std::cout<<"Number of items is more";
}