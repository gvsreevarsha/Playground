#include<iostream>
using namespace std;
int pow(int x,int y)
{
  if(y==0)
    return 1;
  return x*pow(x,y-1);
}
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}