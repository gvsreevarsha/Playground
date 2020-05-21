#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  n%2?std::printf("Not possible"):std::printf("Possible");
  return 0;
}