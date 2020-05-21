#include<iostream>
int main()
{
  int a,b,c,d,flag=0,i;
  std::cin>>a>>b>>c>>d;
  for(i=((a<=b && a<=c)?a:((b<=a && b<=c)?b:c));i>=1;i--)
    if(a%i==0 && b%i==0 && c%i==0)
      break;
  if(i==d)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}