#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,sum=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
    sum+=a[i];
  }
  if(sum<=n){
    cout<<"YES";
  }
  else{
    cout<<"NO";
  }
}