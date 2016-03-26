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
	long long n,arr[MAX],i,totalsum,chocoPerPerson,totalMove;	
	while(t--){
		cin>>n;
		totalsum=0;
		for(i=0;i<n;i++){
			cin>>arr[i];
			totalsum=totalsum+arr[i];
		}
		if(totalsum%n==0){
				chocoPerPerson=totalsum/n;
				totalMove=0;
				for(i=0;i<n;i++){
					if(arr[i]>chocoPerPerson)
						totalMove=totalMove+(arr[i]-chocoPerPerson);
				}
				cout<<totalMove<<"\n";
				
		}else{
			cout<<"No Treat\n";
		}
	}
	return 0;
}