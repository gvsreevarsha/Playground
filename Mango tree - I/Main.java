#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if((1<=c && c<=b)|| c%b==1 or c%(a+b)==0)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}