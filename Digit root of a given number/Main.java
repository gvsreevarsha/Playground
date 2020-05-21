#include<iostream>
int digit(int n)
{
  if(n<=9)
  {
    return n;
  }
  else
  {
    int sum=0,temp;
    temp=n;
    while(temp>0)
    {
      sum+=temp%10;
      temp/=10;
    }
    return digit(sum);
  }
}
int main()
{
  int a;
  std::cin>>a;
  std::cout<<digit(a);
}