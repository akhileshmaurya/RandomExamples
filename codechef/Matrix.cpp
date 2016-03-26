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
#define MAX 500


using namespace std;

int min(int a, int b){
	return (a < b)? a: b; 
}
 

int min(int a, int b, int c){ 
return min(min(a, b), c);
}
 
int max(int a, int b){
	return (a > b)? a: b; 
}

int main(int argc, char const *argv[])
{
	
	int n,m,i,j,k,l,t;
	long long int arr[MAX][MAX];
	//cin>>t;
	scanf("%d",&t);
	while(t--){
	//cin>>n>>m;
	scanf("%d%d",&n,&m);
	for(i=0;i<n;i++){
		 for(j=0;j<m;j++)
			 //cin>>arr[i][j];
		 scanf("%lld",&arr[i][j]);
	}
	
	for(i=1;i<=(m+n-1);i++){				  
			int startRow=max(0,i-m);			
			int count = min(i, (n-startRow), m);
			//cout<<"startRow "<<startRow<<" count :"<<count<<"\n";
			for(j=0;j<count;j++){
				int rowIndex=startRow+j;
				int columnIndex=min(m,i)-1-j;
				//cout<<"("<<rowIndex<<" , "<<columnIndex<<")\t";
				//cout<<arr[rowIndex][columnIndex]<<" ";
				printf("%lld ",arr[rowIndex][columnIndex]);
			}			
	}	
}
	return 0;
}