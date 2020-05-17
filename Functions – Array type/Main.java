#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int size,even=0,odd=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>size;
  int a[size];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<size;i++){
    cin>>a[i];
    if(a[i]%2==0)
    	even+=1;
    else
    	odd+=1;
  }
  if(even!=0 && odd!=0)
    cout<<"The array is Mixed";
  else if(odd==0)
    cout<<"The array is Even";
  else
    cout<<"The array is Odd";
}