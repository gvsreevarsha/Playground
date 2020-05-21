#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,a[100][100],b[100][100],i,j;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
  	for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<m;i++)
  	for(j=0;j<n;j++)
      std::cin>>b[i][j];
  for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
      std::cout<<a[i][j]+b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}