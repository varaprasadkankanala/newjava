package org.example.atm;

public class AccountValidation {
    public static void main(String[] args) {
        AccountService as = new AccountService();
        User arunkumar = new User();
        arunkumar.adharNumber = "99852123658";
        arunkumar.mobileNumber = "6300928054";
        arunkumar.name = "arunkumar";
        arunkumar.pan = "458ahah5";


        Account arunAccount = as.createAccount(arunkumar);
        System.out.println("adharnumber" + arunkumar.adharNumber);
        System.out.println("arunaccountNumber" + arunAccount.accountNumber + "name" + arunAccount.user);
        DebitCard arunDebitCard = as.issueCard(arunAccount);
        System.out.println(arunDebitCard);
        System.out.println("");

    }
}
