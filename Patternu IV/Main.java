#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(j=0;j<n-1;j++)
        std::cout<<i;
      std::cout<<i+1;
    }
    else
    {
      std::cout<<i+1;
      for(j=0;j<n-1;j++)
        std::cout<<i;
    }
    std::cout<<"\n";
  }
  return 0;
}