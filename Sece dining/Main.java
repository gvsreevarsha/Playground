#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  char a[6];
  int b;
  std::cin>>a>>b;
  if((a[0]=='f' && b==1)||(a[0]=='r' && b==0))
    std::cout<<"Left Handed";
  else
    std::cout<<"Right Handed";
}