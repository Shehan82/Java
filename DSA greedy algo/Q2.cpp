#include<iostream>

using namespace std; 


//Greedy Component
void calculateMasks(int a[], int b[], int c){
	
	int total = 0;
	
	for (int i = 0; i < c-1; i++) {
	
  		if(b[i]<b[i+1]){
  			a[i+1] = a[i+1]+1;
		}else if(b[i] > b[i+1]){
			a[i] = a[i] + 1;
		}
	
		total += a[i];
	
	}

	total += a[c-1];
	
	cout << total;

}


int main() 
{ 

	int n, m; 
	
	cin >> n;
		
	int marks[n];
	int masks[n];
	
	for(m=0;m<n;m++){

        cin>>marks[m];
        masks[m] = 1;
    }
	
	calculateMasks(masks, marks, n);
	
	return 0; 
} 

