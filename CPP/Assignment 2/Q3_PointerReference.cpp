
#include <iostream>
using namespace std;

int main(){
    int a=10;

    int *p=&a;
    int &r=a;

    cout<<"Initial value: "<<a<<endl;

    *p=20;
    cout<<"After pointer change: "<<a<<endl;

    r=30;
    cout<<"After reference change: "<<a<<endl;
}
