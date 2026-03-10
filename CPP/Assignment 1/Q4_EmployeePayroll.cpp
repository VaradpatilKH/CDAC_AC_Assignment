
#include <iostream>
#include <string>
using namespace std;

class Employee{
private:
    int empID;
    string empName;
    double empSalary;

public:
    void setID(int id){ empID = id; }
    void setName(string name){ empName = name; }
    void setSalary(double salary){ empSalary = salary; }

    double calculateGrossSalary(){
        if(empSalary <= 5000)
            return empSalary + empSalary*0.10;
        else if(empSalary <= 10000)
            return empSalary + empSalary*0.15;
        else
            return empSalary + empSalary*0.20;
    }

    void display(){
        cout<<"ID: "<<empID<<endl;
        cout<<"Name: "<<empName<<endl;
        cout<<"Salary: "<<empSalary<<endl;
        cout<<"Gross Salary: "<<calculateGrossSalary()<<endl;
    }
};

int main(){
    Employee e;
    int choice;

    do{
        cout<<"\n1.Add Employee\n2.Calculate Gross Salary\n3.Display\n4.Update\n5.Exit\n";
        cin>>choice;

        switch(choice){
            case 1:{
                int id; string name; double salary;
                cout<<"Enter ID: "; cin>>id;
                cout<<"Enter Name: "; cin>>name;
                cout<<"Enter Salary: "; cin>>salary;

                e.setID(id);
                e.setName(name);
                e.setSalary(salary);
                break;
            }

            case 2:
                cout<<"Gross Salary: "<<e.calculateGrossSalary()<<endl;
                break;

            case 3:
                e.display();
                break;

            case 4:{
                string name; double salary;
                cout<<"Enter New Name: "; cin>>name;
                cout<<"Enter New Salary: "; cin>>salary;

                e.setName(name);
                e.setSalary(salary);
                break;
            }
        }

    }while(choice != 5);
}
