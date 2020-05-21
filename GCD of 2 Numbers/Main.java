#include<iostream>
int gcd(int x,int y)
{
  if(y>x)
    gcd(y,x);
  else if (y != 0)
  	return gcd(y, x % y);
  else 
  	return x;
}
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}