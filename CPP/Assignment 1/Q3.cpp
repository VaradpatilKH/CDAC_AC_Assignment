#include<iostream>
using namespace std;

class TollBooth
{
private:
    int totalVehicles;
    double totalRevenue;
    double carRevenue;
    double truckRevenue;
    double busRevenue;
public:
    TollBooth()
    {
        totalVehicles = 0;
        totalRevenue = 0;

        carRevenue = 0;
        truckRevenue = 0;
        busRevenue = 0;
    }
    void reset()
    {
        totalVehicles = 0;
        totalRevenue = 0;
        cout<<"Booth statistics reset\n";
    }



    void vehiclePayingToll(int vehicleType)
    {
        totalVehicles++;

        if(vehicleType == 1)
        {
            totalRevenue += 180;
            carRevenue += 180;
        }

        else if(vehicleType == 2)
        {
            totalRevenue += 300;
            truckRevenue += 300;
        }

        else if(vehicleType == 3)
        {
            totalRevenue += 350;
            busRevenue += 350;
        }
    }

    void displayVehicleWiseRevenue()
    {
        cout<<"Car Revenue: "<<carRevenue<<endl;
        cout<<"Truck Revenue: "<<truckRevenue<<endl;
        cout<<"Bus Revenue: "<<busRevenue<<endl;
    }

    void displayTotalRevenue()
    {
        cout<<"Total Revenue: "<<totalRevenue<<endl;
    }

    int getTotalVehicles()
    {
        return totalVehicles;
    }

    double getTotalRevenue()
    {
        return totalRevenue;
    }
};

int main()
{
    TollBooth booth;

    int choice;

    while(true)
    {
        cout<<"1 Add Car"<<endl;
        cout<<"2 Add Truck"<<endl;
        cout<<"3 Add Bus"<<endl;
        cout<<"4 Display Total Vehicles"<<endl;
        cout<<"5 Display Total Revenue"<<endl;
        cout<<"6 Display Type Total Revenue"<<endl;
        cout<<"7 Reset Booth"<<endl;
        cout<<"8 Exit"<<endl;

        cout<<"Enter choice: "<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
                booth.vehiclePayingToll(1);
                break;

            case 2:
                booth.vehiclePayingToll(2);
                break;

            case 3:
                booth.vehiclePayingToll(3);
                break;

            case 4:
                cout<<"Total Vehicles: "<<booth.getTotalVehicles()<<endl;
                break;

            case 5:
                cout<<"Total Revenue: "<<booth.getTotalRevenue()<<endl;
                break;
            case 6:
                booth.displayVehicleWiseRevenue();
                break;

            case 7:
                booth.reset();
                break;

            case 8:
                return 0;

            default:
                cout<<"Invalid choice"<<endl;
        }
    }
}