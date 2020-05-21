#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,k=0,a[100],i,temp,count1=0,count2=0;
  std::cin>>n;
  temp=n;
  do{
    a[k++]=temp%10;
  }while((temp/=10)!=0);
  for(i=0;i<k;i++)
    (a[i]%2==0)?count1+=a[i]:count2+=a[i];
  (count1==count2)?std::cout<<"Yes":std::cout<<"No";
}