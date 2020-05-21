#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[100],k,l,i;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>k;
  if(k>n+1)
  {
    std::cout<<"Invalid Input";
    exit(0);
  }
  std::cout<<"Enter the value to insert\n";
  std::cin>>l;
  for(i=n+1;i>=k;i--)
    a[i]=a[i-1];
  a[k-1]=l;
  std::cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
    std::cout<<a[i]<<"\n";
}