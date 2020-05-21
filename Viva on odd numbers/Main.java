#include<iostream>
using namespace std;  
int main()
{
  int count=0,n;
  float score=0.0;
  while(count!=3)
  {
    std::cin>>n;
    if(n<0)
    {
      score--;
      break;
    }
    if(n>0 && n%2==1)
    {
      score++;
      count++;
    }
    if(n>0 && n%2==0)
      score-=0.5;
  }
  std::cout<<score;
}