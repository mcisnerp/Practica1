package com.nttdata.Practica1;

public class Customer {

    private String firstName;
    private String lastName;
    private double account;

    public void Costumer(String f,String i){
        this.firstName=f;
        this.lastName=i;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccount(){
        return account;
    }

    public double setAccount(double acct){
        this.account = acct;
        return account;
    }

}
