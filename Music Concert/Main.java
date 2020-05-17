#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,x,wcount=0,mcount=0;
  cin>>n;
  while(n){
    cin>>x;
    if(x%2==0)
      wcount+=1;
    else
      mcount+=1;
    n--;
   }
   cout<<mcount<<"\n"<<wcount;
}