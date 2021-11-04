package com.nttdata.Practica1;

public class Account {

    private double balance;

    public void Account(double initBalance){
        this.balance =initBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amt){
        return this.balance +=amt;
    }

    public double withdraw(double amt) {
        if (saldoPositivo(amt) < 0) {
            //System.out.println("Saldo insuficiente");
            this.balance = balance + amt;
        }
        return balance;
    }

    public double saldoPositivo(double amt){
        this.balance -= amt;
        return balance;
    }
}
