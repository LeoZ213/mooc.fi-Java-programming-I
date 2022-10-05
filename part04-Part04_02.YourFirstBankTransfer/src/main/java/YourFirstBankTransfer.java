
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MatthewsAccount = new Account("Matthews account", 1000.0);
        Account Myaccount = new Account("My account", 0.00);

        
        MatthewsAccount.withdrawal(100.0);
        Myaccount.deposit(100);
        
        System.out.println(MatthewsAccount);
        System.out.println(Myaccount);
    }
}
