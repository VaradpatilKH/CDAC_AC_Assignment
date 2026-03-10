#include<iostream>
using namespace std;

class Student
{
private:
    string name;
    int rollNumber;
    float marks;
    char grade;

public:

    void setName(string n)
    {
        name = n;
    }

    void setRoll(int r)
    {
        rollNumber = r;
    }

    void setMarks(float m)
    {
        marks = m;
        calculateGrade();
    }

    string getName()
    {
        return name;
    }

    int getRoll()
    {
        return rollNumber;
    }

    float getMarks()
    {
        return marks;
    }

    char getGrade()
    {
        return grade;
    }

    void calculateGrade()
    {
        if(marks >= 90)
            grade = 'A';
        else if(marks >= 80)
            grade = 'B';
        else if(marks >= 70)
            grade = 'C';
        else if(marks >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    // void display()
    // {
    //     cout<<"Name: "<<name<<endl;
    //     cout<<"Roll Number: "<<rollNumber<<endl;
    //     cout<<"Marks: "<<marks<<endl;
    //     cout<<"Grade: "<<grade<<endl;
    // }
};

int main()
{
    Student s;

    int choice;
    string name;
    int roll;
    float marks;

    while(true)
    {
        cout<<"\n1 Accept Info";
        cout<<"\n2 Display Info";
        cout<<"\n3 Calculate Grade";
        cout<<"\n4 Exit";
        cout<<"\nEnter choice: ";
        cin>>choice;

        switch(choice)
        {
            case 1:
                cout<<"Enter Name: ";
                cin>>name;
                cout<<"Enter Roll: ";
                cin>>roll;
                cout<<"Enter Marks: ";
                cin>>marks;

                s.setName(name);
                s.setRoll(roll);
                s.setMarks(marks);
                break;

            case 2:
                cout<<"Name : "<<s.getName()<<endl;
                cout<<"Roll No. : "<<s.getRoll()<<endl;
                cout<<"Marks : "<<s.getMarks()<<endl;
                cout<<"Grade : " <<s.getGrade()<<endl;
                break;

            case 3:
                s.calculateGrade();
                cout<<"Grade calculated.\n";
                break;

            case 4:
                return 0;

            default:
                cout<<"Invalid choice";
                break;
        }
    }
}