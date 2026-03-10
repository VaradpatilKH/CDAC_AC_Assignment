#include<iostream>
using namespace std;

class BankAccount
{
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:

    void setAccountNumber(int acc)
    {
        accountNumber = acc;
    }

    void setAccountHolderName(string name)
    {
        accountHolderName = name;
    }

    void setBalance(double b)
    {
        balance = b;
    }

    int getAccountNumber()
    {
        return accountNumber;
    }

    string getAccountHolderName()
    {
        return accountHolderName;
    }

    double getBalance()
    {
        return balance;
    }

    void deposit(double amount)
    {
        if(amount <= 0)
        {
            cout<<"Invalid amount";
            return;
        }
        else
            balance = balance + amount;
            cout<<"Amount Deposited Successfully\n";
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            cout<<"Withdrawal Successful\n";
        }
        else
        {
            cout<<"Insufficient Balance\n";
        }
    }

    void displayAccountDetails()
    {
        cout<<"Account Number: "<<accountNumber<<endl;
        cout<<"Account Holder: "<<accountHolderName<<endl;
        cout<<"Balance: "<<balance<<endl;
    }
};

int main()
{
    BankAccount acc;

    int choice;
    int accNo;
    string name;
    double bal;
    double amount;

    cout<<"Enter Account Number: ";
    cin>>accNo;

    cout<<"Enter Account Holder Name: ";
    cin>>name;

    cout<<"Enter Initial Balance: ";
    cin>>bal;

    acc.setAccountNumber(accNo);
    acc.setAccountHolderName(name);
    acc.setBalance(bal);

    while(true)
    {
        cout<<"\n1 Deposit";
        cout<<"\n2 Withdraw";
        cout<<"\n3 Display Details";
        cout<<"\n4 Exit";

        cout<<"\nEnter choice: ";
        cin>>choice;

        switch(choice)
        {
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
                acc.displayAccountDetails();
                break;

            case 4:
                return 0;

            default:
                cout<<"Invalid choice\n";
        }
    }
}