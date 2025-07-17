package Estudo01Base.Entities;

import Estudo01Base.application.Account;
import Estudo01Base.application.BusinessAccount;
import Estudo01Base.application.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

//        Account acc = new Account(1002, "David", 1200.0);
//        BusinessAccount bacc = new BusinessAccount(1200.0, 1003 ,"Luis", 0.0);
//
//        // UPCASTING
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(500.0, 1004, "Gaby", 100.0);
//        Account acc3 = new SavingsAccount(100.0, 1005, "Bob", 200.0 );
//
//        // DOWN CASTING
//        BusinessAccount acc4 =  (BusinessAccount)acc2;
//        acc4.loan(100.0);
//
////        BusinessAccount acc5 =  (BusinessAccount)acc3;
////        acc5.loan(100.0);
//
//        // nao se pode ja que acc3 nao e Business mas sim Savings
//        if (acc3 instanceof  BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount)acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan !");
//        }
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("UpDate !");
//        }
//
//
//        // acessando o metodo withdraw da class Account na SavingsAccount
//        Account acc01 = new Account(1001, "Alex", 1000.0);
//        acc01.withdraw(200.0);
//        System.out.println("Valor do saque #1 ");
//        System.out.println(acc01.getBalance());
//
//        // agr podemos acessao o metodo withdraw da class Account
//        Account acc02 = new SavingsAccount(0.01, 1005, "Bob", 1000.0 );
//        acc02.withdraw(200.0);
//        System.out.println("Valor do saque #2 ");
//        System.out.println(acc02.getBalance());
//
//        Account acc03 = new BusinessAccount(500.0, 1003, "David",1000.0 );
//        acc03.withdraw(200.0);
//        System.out.println("Valor de saque #3");
//        System.out.println(acc03.getBalance());
//
//        // estudo sobre polimorfismo
//
//        Account x = new Account(1020, "Alex", 1200.0);
//        Account y = new SavingsAccount(0.01, 1023,"Maria", 1200.0);
//
//        x.withdraw(50.0);
//        y.withdraw(50.0);
//
//        System.out.println(y.getBalance());
//        System.out.println(x.getBalance());

        // usando abstrat
        List<Account> list = new ArrayList<>();
        list.add(new BusinessAccount(500.0, 1001,"Luis", 1000.0 ));
        list.add(new BusinessAccount(300.0, 1002,"David", 1800.0 ));
        list.add(new SavingsAccount(0.01, 1003, "Felipe", 1000.0));
        list.add(new SavingsAccount(0.01, 1004, "Luanna", 800.0));


        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account account : list){
            System.out.printf("Update balance for account %d: %.2fn", account.getNumber(), account.getBalance());
        }




    }
}
