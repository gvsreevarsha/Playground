#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,td,tc;
  std::cin>>a>>c>>b>>d;
  td=a+b+((c+d)/100);
  tc=(c+d)%100;
  std::cout<<td<<"\n"<<tc;
}