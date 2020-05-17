#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  //Type your code here.
  int s;
  cout<<"Enter the number of elements in the array\n";
  cin>>s;
  int a[s];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<s;i++)
    cin>>a[i];
  int loc,val;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc>s){
    cout<<"Invalid Input";
    exit(0);
  }
  cout<<"Enter the value to insert\n";
  cin>>val;
  cout<<"Array after insertion is\n";
  for(int i=0;i<s;i++){
    if(i!=loc-1)
      cout<<a[i]<<"\n";
    else
      cout<<val<<"\n"<<a[i]<<"\n";
  }
}