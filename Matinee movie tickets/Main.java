#include<iostream>
int main()
{
  //Type your code here.
  int a;
  float b;
  std::cin>>a;
  std::cin>>b;
  if(b>13 && b<14)
  {
    if(a>13)
      std::cout<<"$5.00";
    else
      std::cout<<"$2.00";
  }
  else
  {
    if(a>13)
      std::cout<<"$8.00";
    else
      std::cout<<"$4.00";
  }
}