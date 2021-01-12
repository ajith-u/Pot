#include <iostream>
#include<math.h>
using namespace std;

int main() { 
  int n;
  cin>>n;
  if(1<=n && n<=10){
    bool ch=true;
    int p,sum=0;
    for(int i=0;i<n;i++){
      cin>>p;
      if(10<=p && p<=9999)
        sum+=pow(p/10,p%10);
      else{
        ch=false;
        break;
      }
    }
    if(ch && sum<=1000000000) cout<<sum;
  }
  
}

