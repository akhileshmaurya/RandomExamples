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
	long long int n,i;
	cin>>n;
	
	long long int arr[n];
	for(i=0;i<n;i++){
		  cin>>arr[i];
	}
	sort(arr,arr+n);
	
	for(i=n-1;i>0;i--){
		if(arr[i]>arr[i-1]){
			cout<<arr[i-1]<<"\n";
			break;
		}
	}
	if(i==0)
		cout<<"0\n";
	return 0;
}