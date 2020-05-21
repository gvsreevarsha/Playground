#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,cost;
  std::cin>>n;
  if(n<=200)
    cost=0.5*n;
  else if(n<=400)
    cost=0.65*n+100;
  else if(n<=600)
    cost=0.8*n+200;
  else
    cost=1.25*n+425;
  std::cout<<"Rs."<<cost;
}