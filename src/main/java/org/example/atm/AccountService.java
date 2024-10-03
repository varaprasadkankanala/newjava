package org.example.atm;
import java.util.Date;
import java.util.UUID;

public class AccountService {
    public Account  createAccount(User user)

    {
        Account a = new Account();
        a.accountNumber=UUID.randomUUID().toString();
        a.user=user;

        return a;

    }

    public DebitCard issueCard( Account account1 )
    {
        DebitCard d1 = new DebitCard();
        d1.atmNumber=UUID.randomUUID().toString();
        d1.cvv="1ll44";
        d1.name="arunv";
        d1.toDate=  new Date();
        d1.fromDate=new Date();

        return  d1;

    }




}

