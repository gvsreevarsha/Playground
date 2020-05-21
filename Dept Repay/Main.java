#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  std::cin>>p>>r>>t;
  std::cout<<(p*r*t)/100<<"\n"<<p+((p*r*t)/100)<<"\n"<<0.02*((p*r*t)/100)<<"\n"<<((1-0.02)*((p*r*t)/100))+p;  
}