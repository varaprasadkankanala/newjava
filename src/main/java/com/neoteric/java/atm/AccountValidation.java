package com.neoteric.java.atm;

public class AccountValidation {
    public static void main(String[] args) {
        AccountService as = new AccountService();
        User arunkumar = new User();
        arunkumar.adharNumber = "99852123658";
        arunkumar.mobileNumber = "6300928054";
        arunkumar.name = "arunkumar";
        arunkumar.pan = "458ahah5";


        Account arunAccount = as.createAccount(arunkumar);
        System.out.println("arunaccountNumber" + arunAccount.accountNumber + "name" + arunAccount.user);
        System.out.println("______________________________________");
        DebitCard arunDebitCard = as.issueCard(arunAccount);
        System.out.println("______________________________________");
        System.out.println(arunDebitCard);
        System.out.println("______________________________________");

    }
}
