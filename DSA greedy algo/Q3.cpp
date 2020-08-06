#include<iostream>
using namespace std;
int numberofcontainers(int n,int *array);
int main(){
	int n;
	int temp;
	cin>>n;
	int * array;
	array=new int[n];
	for(int i=0;i<n;i++){
		cin>>array[i];
	}
//sort the array
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(array[j]<array[i]){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	numberofcontainers(n,array);
}
int numberofcontainers(int n,int *array){
	int i=0;
	int count=0;
		while(i<n-1){
			for(int j=i+1;j<n;j++){
				if(array[j]-array[i]<5){
					if(j==n-1){
						i=j;
						break;
						}
				}
				else{
					i=j;
					count++;
					break;
				}
			}
		
	}
	if(n==0)
	cout<<count;
	else
	cout<<count+1;
	
}

