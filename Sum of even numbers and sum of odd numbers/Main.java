#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,esum=0,osum=0,x;
  cin>>s;
  while(cin>>x){
    if(x%2==0){
      esum+=x;
    }
    else{
      osum+=x;
    }
  }
  cout<<"The sum of the even numbers in the array is "<<esum<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<osum;
}