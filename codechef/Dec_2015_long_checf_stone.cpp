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
int max(int a, int b) { return (a > b)? a : b; }
using namespace std;

	long getMaximumPssibleSum(long max,long m)
	{
	          set<Long> sums;
		  set<long>::iterator it;
		  long maximum=0;
			   for (long input=0;input<=m;input++) {
			    	set<long> newSums;                      
				    for (it = sums.begin(); it != sums.end(); ++it){
					 long sum = *it; 
					long newSum = sum + input;
						if (newSum <= K) {
						    newSums.insert(newSum);                   
							    if (newSum > maximum) {
								maximum = newSum;
							    }
						}
				    }
			    sums.addAll(newSums);
			    cout<<"New Sum :"<<maximum;
			}
		return maximum;
	}
	int main(){

		long t,n1,n2,m,i,j,min,output;
		cin>>t;
		while(t--){
			cin>>n1>>n2>>m;
			
			if(n1<=n2){
				min=n1;
			}else{
				min=n2;
			}
			if(min <= m){
			  output=n2-min;
			}else if(min >= (m*(m+1)/2)){
			 	output=(n1+n2)-(m*(m+1));  
			}else{
                            
			}

		}
	}
