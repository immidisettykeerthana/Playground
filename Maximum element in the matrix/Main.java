#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,x,max_ele=0;
  cin>>r>>c;
  while(cin>>x){
    if(x>max_ele){
      max_ele=x;
 	}
  }
  cout<<"The maximum element is "<<max_ele;
}