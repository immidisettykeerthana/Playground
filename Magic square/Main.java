#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,fdsum=0,bdsum=0;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++){
	for(int j=0;j<r;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<r;j++){
      if(i==j)
        fdsum=fdsum+a[i][j];
      if ((i + j) == (r - 1)) 
        bdsum = bdsum + a[i][j];
    }
  }
  if(fdsum==bdsum){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  }
}