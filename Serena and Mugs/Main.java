#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,a[100],sum=0;
  std::cin>>n>>s;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    sum+=a[i];
  }
  if(sum<=s)
    std::cout<<"YES";
  else
    std::cout<<"NO";
}