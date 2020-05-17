#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,rno,flag=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>rno;
  for(int i=0;i<n;i++){
    if(a[i]==rno){
      cout<<"She passed her exam";
      flag=1;
      break;
    }
   }
  if(flag==0)
    cout<<"She failed";
}