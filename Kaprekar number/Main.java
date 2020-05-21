#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  int n=0,temp,k,a[100],i=0,x=1;
  std::cin>>k;
  temp=k;
  do{
    n++;
  }while((temp/=10)!=0);   
  temp=k*k;
  for(i=0;i<n;i++)
    x*=10;
  if(k==int(temp/x)+(temp%x))
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
}