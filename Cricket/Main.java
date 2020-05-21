#include<iostream>
using namespace std;
float round(float var) 
{ 
    float value = (int)(var * 10 + .5); 
    return (float)value / 10; 
} 
int main()
{
  //Type your code here.
  int a,b,c,d;
  float e;
  std::cin>>a>>b>>c>>d;
  e=float(d/6)+float(0.1*(d%6));
  std::cout<<a/6.0<<"\n"<<e<<"\n"<<round(c/e)<<"\n"<<round(b*6.0/a)<<"\n";
  if((round(b*6.0/a))<(round(c/e)))
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
    
}
