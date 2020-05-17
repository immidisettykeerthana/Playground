#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  int num,r,esum=0,osum=0;
  cin>>num;
  while(num>0){
    r=num%10;
    if(r%2==0)
      esum+=r;
    else
      osum+=r;
    num=num/10;
  }
  if(esum==osum)
    cout<<"Yes";
  else
    cout<<"No";
}