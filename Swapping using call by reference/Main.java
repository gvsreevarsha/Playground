#include<iostream>
void swap(int &p,int &q)
{
  int t;
  t=p;
  p=q;
  q=t;
}
int main()
{
  int m,n;
  std::cin>>m>>n;
  std::cout<<"Before swapping a= "<<m<<" and b="<<n;
  swap(m,n);
  std::cout<<"\nAfter swapping a= "<<m<<" and b="<<n;
}