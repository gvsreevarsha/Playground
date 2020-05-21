#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n,a[100][100],max[100]={0};
  std::cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(a[j][i]>max[i])
         max[i]=a[j][i];
    }
  }
  for(i=0;i<n;i++)
    std::cout<<max[i]<<"\n";
}