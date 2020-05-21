#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7],i,sum=0,amt=0;
  for(i=0;i<7;i++)
  {
    std::cin>>a[i];
    amt+=100*a[i];
    sum++;
    if(a[i]>8)
      amt+=(a[i]-8)*15;
	}
  if(sum>40 && a[0]==0 && a[6]==0)
    amt+=25;
  if(a[0]!=0)
    amt+=50*a[0];
  if(a[6]!=0)
    amt+=25*a[6];
  std::cout<<amt;
}