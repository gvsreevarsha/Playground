#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  std::cin>>n;
  while(n>1)
  {
    std::cout<<n<<"\n";
    if(n%2==0)
     	n=n/2;
    else
      	n=n*3+1;
    count++;
  }
  cout<<"1\n"<<count;
}