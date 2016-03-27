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
	int t,i,j,output;
	int array[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
	string input;
	cin>>t;
	while(t--){
		cin>>input;
		output=0;
		for (int i = 0; i < input.length(); ++i)
		{
			output=output+array[input[i]-'A'];
		}
		cout<<output<<"\n";
	}
	return 0;
}