#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  std::cin>>n;
  for(i=0;i*i<=n;i++);
  std::cout<<n+i;
}