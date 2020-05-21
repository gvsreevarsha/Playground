#include<iostream>
int main(){
  // Type your code here
  int n,m,f;
  m=f=0;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    int a;
    std::cin>>a;
    if(a%2==0)
      f++;
    else
      m++;
  }
  std::cout<<m<<"\n"<<f;
  return 0;
}