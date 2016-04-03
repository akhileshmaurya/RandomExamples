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
	long long i, t,output,k,arr[3];
	cin>>t;
	while(t--){
		cin>>arr[0]>>arr[1]>>arr[2];
		cin>>k;
		sort(arr,arr+3);
		output=0;
		for ( i = 0; i <3 ;++i)
		{
			if(arr[i]>=k-1)
				output=output+k-1;
			else
				output=output+arr[i];
		}
		output=output+1;
		cout<<output<<"\n";
	}
	return 0;
}