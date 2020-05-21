#include <iostream>
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    long int i,n,flag=0;
    std::cin>>n;
    for(i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(n==1)
        std::cout<<"Not eligible";
    else if(flag==0)
        std::cout<<"Eligible";
    else
       	std::cout<<"Not eligible";
    return 0;
}