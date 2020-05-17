#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=1;i<=r;i++){
    for(int j=1;j<=c;j++){
      cin>>a[i][j];
    }
  }
  int max=0;
  for(int i=1;i<=c;i++){
    for(int j=1;j<=r;j++){
      if(a[j][i]>max){
      	max=a[j][i];
	  }
  	}
	cout<<max<<"\n";
	max=0;
  }
}