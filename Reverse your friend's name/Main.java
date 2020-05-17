#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string s;
  getline(cin,s);
  int x=s.size()-1;
  while(x){
    cout<<s.at(x);
    s.pop_back();
    x--;
  }
  cout<<s.at(x);
}