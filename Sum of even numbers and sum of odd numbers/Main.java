#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,a,evensum=0,oddsum=0;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
  	std::cin>>a;
    if(a%2==0)
      evensum+=a;
    else
      oddsum+=a;
  }
  std::cout<<"The sum of the even numbers in the array is "<<evensum<<"\nThe sum of the odd numbers in the array is "<<oddsum;
}