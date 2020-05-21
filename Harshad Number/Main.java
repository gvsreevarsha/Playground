#include <iostream>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    long int n,i,temp,sum=0;
    std::cin>>n;
    temp=n;
    while(temp!=0)
    {
        sum+=temp%10;
        temp/=10;
    }
    if(n%sum==0)
        std::cout<<"Harshad Number";
    else
        std::cout<<"Not Harshad Number";
    return 0;
}
