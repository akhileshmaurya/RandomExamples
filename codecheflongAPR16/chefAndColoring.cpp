#include <iostream>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <vector>
#include <map>
#include <list>
#include <stack>
#include <queue>
#include <algorithm>
#define MAX 100000
using namespace std;

int main(int argc, char const *argv[])
{
	
	int t;
	cin>>t;
	long long n,rCount=0,gCount=0,bCount=0,max;	
	string input;
	while(t--){
		cin>>n;
		cin>>input;
		rCount=0,gCount=0,bCount=0;
		string::const_iterator i;
   for(i=input.begin(); i!=input.end(); i++){
			 if(*i=='R'){
				 rCount++;
			 }else  if(*i=='B'){
				 bCount++;
			 }else  if(*i=='G'){
				 gCount++;
			 }
     }
		 max=rCount;
		 if(gCount>max)
			 max=gCount;
		 if(bCount>max)
			 max=bCount;
		cout<<(rCount+gCount+bCount-max)<<"\n";
	}
	return 0;
}