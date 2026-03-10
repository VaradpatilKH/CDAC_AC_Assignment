
#include <iostream>
#include <string>
using namespace std;

class Student{
private:
    int rollNo;
    string name;
    float marks;

public:
    Student(){
        rollNo=0;
        name="Default";
        marks=0;
    }

    Student(int r,string n,float m){
        rollNo=r;
        name=n;
        marks=m;
    }

    Student(int rollNo,string name,float marks,bool useThis){
        this->rollNo=rollNo;
        this->name=name;
        this->marks=marks;
    }

    void display(){
        cout<<rollNo<<" "<<name<<" "<<marks<<endl;
    }
};

int main(){
    Student s1;
    Student s2(1,"Alice",90);
    Student s3(2,"Bob",85,true);

    s1.display();
    s2.display();
    s3.display();
}
