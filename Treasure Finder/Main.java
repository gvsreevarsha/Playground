#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i=1;
  std::cin>>a>>b>>c;
  std::cout<<"The treasure is in box which has number "<<(((a>b && a<c)||(a<b && a>c))?a:(((a>b && b>c)||(a<b && b<c))?b:c));
  for(i=((a<=b && a<=c)?a:(b<=a && b<=c)?b:c);i>1;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      break;
  }
  std::cout<<"\nThe code to open the box is "<<i;
}