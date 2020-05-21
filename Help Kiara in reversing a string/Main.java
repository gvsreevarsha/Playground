#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i,j=0;    
//Your code goes here
  gets(str);
  for(i=0;str[i]!='\0';i++);
  i--;
  while(i>=0)
  {
    rev[j]=str[i];
    i--;
    j++;
  }
  rev[j]='\0';
std::cout<<rev;
}