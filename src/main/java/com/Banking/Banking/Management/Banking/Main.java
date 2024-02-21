package com.Banking.Banking.Management.Banking;

public class Main {
    public static void main(String[] args) {
        System.out.println("*--*--*--*--*--*--*--*--*--*--*");
        System.out.println("*--Banking Management System--*");
        System.out.println("*--*--*--*--*--*--*--*--*--*--*");

        CurrentAccount ca = new CurrentAccount("Aditya",8102154l,8000,30);

        SavingAccount sa = new SavingAccount("Shankar",8102154l,12000,30,3.5);
        ca.withdraw(10000);
    }
}
