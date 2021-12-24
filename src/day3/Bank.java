package day3;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();


    //    a1.accountHolderNumber ="Ankita";
        a1.setAccountHolderNumber("Ankita");
    //    a1.accountNumber ="1234567";
        a1.setAccountNumber("1234567");
    //    a1.accountBalance = 1000;
        a1.deposit(a1, 1000);



    //    a2.accountHolderNumber ="Anjali";
        a2.setAccountHolderNumber("Anjali");
    //    a2.accountNumber ="0987654";
        a2.setAccountNumber("0987654");
    //    a2.accountBalance = 200;
        a2.deposit(a2, 200);

        //Transfer Balance from a1 to a2
     //  a1.setAccountBalance(1000-200);
     //   a2.setAccountBalance(200+200);

        a1.transferBalance(a1,a2,200);


        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());

    }
}
