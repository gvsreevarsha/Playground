#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n,a[100][100],sum=0,max,maxsum;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  std::cout<<"Sum of rows is ";
  for(i=0;i<m;i++)
  {
    sum=0;
    for(j=0;j<n;j++)
    {
      sum+=a[i][j];
    }
    if(maxsum<sum)
    {
      maxsum=sum;
      max=i;
    }
    std::cout<<sum<<" ";
  }
  std::cout<<"\nRow "<<max+1<<" has maximum sum\n";
  std::cout<<"Sum of columns is ";
  maxsum=0;
  for(i=0;i<n;i++)
  {
    sum=0;
    for(j=0;j<m;j++)
    {
      sum+=a[j][i];
    }
    if(maxsum<sum)
    {
      maxsum=sum;
      max=i;
    }
    std::cout<<sum<<" ";
  }
  std::cout<<"\nColumn "<<max+1<<" has maximum sum\n";
}