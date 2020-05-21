#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,a[100][100],sum;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
  {
    sum=0;
    for(j=0;j<n;j++)
    {
      std::cin>>a[i][j];
      sum+=a[i][j];
    }
    std::cout<<sum<<"\n";
  }
}