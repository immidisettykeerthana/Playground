#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,sum=0;
  cin>>r>>c;
  int a[r][c],row[r],col[c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
      sum+=a[i][j];
    }
    row[i]=sum;
    sum=0;
  }
  int max=0,mi=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    cout<<row[i]<<" ";
  	if(row[i]>max){
  		max=row[i];
  		mi=i;
	  }
  }
  cout<<"\nRow "<<mi+1<<" has maximum sum\n";
  int cmax=0,csum=0,ci=0;
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
      csum+=a[j][i];
  	}
    col[i]=csum;
    csum=0;
  }
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
    cout<<col[i]<<" ";
    if(col[i]>cmax){
      cmax=col[i];
      ci=i;
    }
  }
  cout<<"\nColumn "<<ci+1<<" has maximum sum";
}