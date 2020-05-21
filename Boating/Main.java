#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(75*b+30*c<=a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}