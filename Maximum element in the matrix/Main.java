#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n,a[100][100],max=0;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if(a[i][j]>max)
         max=a[i][j];
    }
  }
  std::cout<<"The maximum element is "<<max;
}