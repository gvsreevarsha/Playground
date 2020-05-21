#include<iostream>
int main(){
  // Type your code here
  int n,i,ans=1;
  std::cin>>n;
  for(i=2;i<=n;i++)
    ans*=i;
  std::cout<<ans;
}