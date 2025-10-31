#include<bits/stdc++.h>
using namespace std;
int main(){

    // int arr[]={13,46,24,52,20,9};
    int arr[]={1,2,3,4,5,6,7,8,9};
    int n=sizeof(arr)/sizeof(arr[0]);
    
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    // main logic of bubble sort
    bool didSwap= false;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
                didSwap=true;
            }
        }
        cout<<"runs"<<endl;
        if(!didSwap) break;
            else{
                didSwap=false;
            }
    }
    cout<<"sorted array"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}