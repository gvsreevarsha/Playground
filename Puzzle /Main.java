#include<iostream>
int main()
{ 
    // Type your code here
  int r,c,a[100][100],i,j;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      std::cout<<a[j][i]<<" ";
    std::cout<<"\n";
  }
}