#include<iostream>
int main()
{
    // Type your code here
  int r,c,matrix1[100][100],matrix2[100][100],i,j;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
  	for(j=0;j<c;j++)
      std::cin>>matrix1[i][j];
  for(i=0;i<r;i++)
  	for(j=0;j<c;j++)
      std::cin>>matrix2[i][j];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
      std::cout<<matrix1[i][j]+matrix2[i][j]<<" ";
    std::cout<<"\n";
  }
  
}