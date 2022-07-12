
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account MatthewsAccount = new Account ("Matthews account", 1000.00);
        Account MyAccount = new Account ("My account", 0);
        
        MatthewsAccount.withdrawal(100.00);
        MyAccount.deposit(100.00);
        
        System.out.println(MatthewsAccount);
        System.out.println(MyAccount);
    }
}
