#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,a[100][100],sum=0;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      if(i+j==m-1 || i==0 || i==m-1)
        sum+=a[i][j];
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
}