#include<iostream>
int main()
{
  // Type your code here
  int n,max,a[100],i;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  max=a[0];
  for(i=1;i<n;i++)
    if(max<a[i])
      max=a[i];
  std::cout<<max;
}