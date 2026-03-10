
#include <iostream>
#include <string>
using namespace std;

class BankAccount{
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    void setAccountNumber(int n){ accountNumber = n; }
    void setAccountHolderName(string name){ accountHolderName = name; }
    void setBalance(double b){ balance = b; }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            cout<<"Insufficient balance\n";
        }
    }

    void display(){
        cout<<"Account Number: "<<accountNumber<<endl;
        cout<<"Holder Name: "<<accountHolderName<<endl;
        cout<<"Balance: "<<balance<<endl;
    }
};

int main(){
    BankAccount acc;
    acc.setAccountNumber(101);
    acc.setAccountHolderName("User");
    acc.setBalance(1000);

    int choice;
    double amount;

    do{
        cout<<"\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit\n";
        cin>>choice;

        switch(choice){
            case 1:
                cout<<"Enter amount: ";
                cin>>amount;
                acc.deposit(amount);
                break;

            case 2:
                cout<<"Enter amount: ";
                cin>>amount;
                acc.withdraw(amount);
                break;

            case 3:
                acc.display();
                break;
        }

    }while(choice != 4);
}
