#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[100],i,evencount=0,oddcount=0;
  std::cin>>n;
  std::cout<<"Enter the number of elements in the array\nEnter the elements in the array\n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      evencount++;
    else
      oddcount++;
  }
  if(oddcount==0)
    std::cout<<"The array is Even";
  else if(evencount==0)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
}