#include<iostream>
#include<algorithm>
int main()
{
  // Type your code here
  int n,max=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    std::cin>>a[i];
   	if(max<a[i])
    	max=a[i];
   }
  std::cout<<max;
}