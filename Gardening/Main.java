#include<iostream>
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(b<=c && c<=2*b)
    std::cout<<"It is a mango tree";
  else if(((a-1)*b)<=c && c<a*b)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
    
}