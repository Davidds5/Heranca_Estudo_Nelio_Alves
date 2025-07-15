package Estudo01Base.Entities;

import Estudo01Base.application.Account;
import Estudo01Base.application.BusinessAccount;
import Estudo01Base.application.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1002, "David", 1200.0);
        BusinessAccount bacc = new BusinessAccount(1200.0, 1003 ,"Luis", 0.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(500.0, 1004, "Gaby", 100.0);
        Account acc3 = new SavingsAccount(100.0, 1005, "Bob", 200.0 );

        // DOWN CASTING
        BusinessAccount acc4 =  (BusinessAccount)acc2;
        acc4.loan(100.0);




    }
}
