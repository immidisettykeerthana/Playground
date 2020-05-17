#include<iostream>
using namespace std;
int main(){
	int r,c,x,sum=0,count=0;
	cin>>r>>c;
	int m=r*c;
	while(m){
		cin>>x;
		if(count<r){
			sum+=x;
			count++;
		}
		if(count==r){
			cout<<sum<<"\n";
			sum=0;
			count=0;
		}
		m--;
	}
}