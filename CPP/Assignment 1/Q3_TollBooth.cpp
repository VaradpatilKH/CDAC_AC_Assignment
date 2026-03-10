
#include <iostream>
using namespace std;

class TollBooth{
private:
    int totalVehicles;
    double totalRevenue;

public:
    TollBooth(){
        totalVehicles = 0;
        totalRevenue = 0;
    }

    void reset(){
        totalVehicles = 0;
        totalRevenue = 0;
    }

    void vehiclePayingToll(int vehicleType){
        double toll;

        if(vehicleType == 1) toll = 180;
        else if(vehicleType == 2) toll = 300;
        else if(vehicleType == 3) toll = 350;

        totalVehicles++;
        totalRevenue += toll;
    }

    int getTotalVehicles(){ return totalVehicles; }
    double getTotalRevenue(){ return totalRevenue; }
};

int main(){
    TollBooth tb;
    int choice;

    do{
        cout<<"\n1.Standard Car\n2.Truck\n3.Bus\n4.Total Vehicles\n5.Total Revenue\n6.Reset\n7.Exit\n";
        cin>>choice;

        switch(choice){
            case 1: tb.vehiclePayingToll(1); break;
            case 2: tb.vehiclePayingToll(2); break;
            case 3: tb.vehiclePayingToll(3); break;
            case 4: cout<<"Vehicles: "<<tb.getTotalVehicles()<<endl; break;
            case 5: cout<<"Revenue: "<<tb.getTotalRevenue()<<endl; break;
            case 6: tb.reset(); break;
        }

    }while(choice != 7);
}
