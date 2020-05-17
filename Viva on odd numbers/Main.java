#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float count=0;
  while(cin>>x){
    if(x>0 && x%2!=0)
      count++;
    else if(x>0 && x%2==0)
      count=count-0.5;
    else
      count--;
  }
  cout<<count;
}