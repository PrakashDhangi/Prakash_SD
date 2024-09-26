package Assingment3;

public class BankAccount {
    private String accountNumber;
    private String accUserName;
    private double balance;

    public BankAccount(String accUserName, String accountNumber){
        this.accountNumber = accountNumber;
        this.accUserName = accUserName;
    }

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }


    public Double getBalance(){
        return this.balance;
    }

    public String getAccUserName(){
        return this.accUserName;
    }

    public void deposit(double depositAmount){
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("Connot deposit amount");
        }
        this.balance += depositAmount; //this.balance = this.balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0 && withdrawAmount < this.balance){
            throw new IllegalArgumentException("Cannot withdraw your amount");
        }
        this.balance -= withdrawAmount;
    }
}