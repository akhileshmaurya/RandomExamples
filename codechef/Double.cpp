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
using namespace std;

int main(int argc, char const *argv[])
{
	int t,n,output;
	cin>>t;
	while(t--){
		cin>>n;
		if(n%2==0){
			cout<<n<<"\n";
		}else{
			cout<<n-1<<"\n";
		}
		
	}
	return 0;
}