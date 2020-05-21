#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,sum=0,count=0;
  std::cin>>n;
  while(sum<n)
  {
    std::cin>>a;
    sum+=a;
    count++;
  }
  std::cout<<"The number of turns is "<<count;
}