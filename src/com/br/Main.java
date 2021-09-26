package com.br;

import com.br.entities.Account;
import com.br.entities.BusinessAccount;
import com.br.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc2 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        System.out.println(acc);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
