#include<iostream>
using namespace std;

class Employee
{
private:
    int empID;
    string empName;
    double empSalary;

public:

    void setEmployee(int id,string name,double salary)
    {
        empID = id;
        empName = name;
        empSalary = salary;
    }

    double calculateGrossSalary()
    {
        double bonus;

        if(empSalary <= 5000)
            bonus = empSalary * 0.10;

        else if(empSalary <= 10000)
            bonus = empSalary * 0.15;

        else
            bonus = empSalary * 0.20;

        return empSalary + bonus;
    }

    void displayEmployeeDetails()
    {
        cout<<"Employee ID: "<<empID<<endl;
        cout<<"Employee Name: "<<empName<<endl;
        cout<<"Salary: "<<empSalary<<endl;

        cout<<"Gross Salary: "<<calculateGrossSalary()<<endl;
    }

    void updateEmployee(string name,double salary)
    {
        empName = name;
        empSalary = salary;
    }
};

int main()
{
    Employee emp;

    int choice;
    int id;
    string name;
    double salary;

    while(true)
    {
        cout<<"\n1 Add Employee";
        cout<<"\n2 Calculate Gross Salary";
        cout<<"\n3 Display Employee";
        cout<<"\n4 Update Employee";
        cout<<"\n5 Exit";

        cout<<"\nEnter choice: ";
        cin>>choice;

        switch(choice)
        {

            case 1:
                cout<<"Enter ID: ";
                cin>>id;

                cout<<"Enter Name: ";
                cin>>name;

                cout<<"Enter Salary: ";
                cin>>salary;

                emp.setEmployee(id,name,salary);
                break;

            case 2:
                cout<<"Gross Salary: "<<emp.calculateGrossSalary()<<endl;
                break;

            case 3:
                emp.displayEmployeeDetails();
                break;

            case 4:
                cout<<"Enter new name: ";
                cin>>name;

                cout<<"Enter new salary: ";
                cin>>salary;

                emp.updateEmployee(name,salary);
                break;

            case 5:
                return 0;

            default:
                cout<<"Invalid choice\n";
        }
    }
}