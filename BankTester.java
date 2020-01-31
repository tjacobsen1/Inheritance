public class BankTester {
    public static void main(String[] args) {
        Account acc1 = new Account(45);
        Account acc2 = new Account(55);
        Account savings1 = new SavingsAccount(32, 0.06);
        Account savings2 = new SavingsAccount(54, 0.05);
        Account current1 = new CurrentAccount(23);
        Account current2 = new CurrentAccount(12);
        
        Account[] accounts = {acc1, acc2, savings1, savings2, current1, current2};
        
        Bank bank = new Bank(accounts, 20);
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getAccountNumber());
        bank.openAccount(savings1);
        
    }
}