#include<iostream>
int main()
{
  // Type your code here
  int n,a[100],i,search;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>search;
  for(i=0;i<n;i++)
    if(search==a[i])
    	break;
  if(i==n)
    std::cout<<"She failed";
   else
     std::cout<<"She passed her exam";
}