#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i,j,k,l;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j=((100-b)*a/100)+c;
  std::cout<<"In Flipkart Rs."<<j;
  k=((100-e)*d/100)+f;
  std::cout<<"\nIn Snapdeal Rs."<<k;
  l=((100-h)*g/100)+i;
  std::cout<<"\nIn Amazon Rs."<<l;
  std::cout<<"\nHe will prefer ";
  if(j<=k && j<=l)
    std::cout<<"Flipkart";
  else if(k<=j && k<=l)
    std::cout<<"Snapdeal";
  else
    std::cout<<"Amazon";
}