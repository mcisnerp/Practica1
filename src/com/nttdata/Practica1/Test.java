package com.nttdata.Practica1;

public class Test {
    public static void main(String[] args) {
        Customer c= new Customer();
        c.Costumer("Miguel","Cisneros");
        Account a = new Account();
        a.deposit(1500);
        a.withdraw(1200);
        c.setAccount(a.getBalance());

        System.out.println("Mi nombre completo es: "+c.getFirstName()+" "+c.getLastName()+"\nY mi balance es: "+c.getAccount());

        Customer c2= new Customer();
        c2.Costumer("Jesus","Pallares");
        Account a2 = new Account();
        a2.deposit(1500);
        a2.withdraw(1700);
        c2.setAccount(a2.getBalance());

        System.out.println("Mi nombre completo es: "+c2.getFirstName()+" "+c2.getLastName()+"\nY mi balance es: "+c2.getAccount());

    }
}
