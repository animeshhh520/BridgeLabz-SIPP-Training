package Inheritance.Bank_Account_types;

public class BankAccountMain {
    public static void main(String[] args) {
        System.out.println("=== Bank Accounts ===");

        SavingsAccount savings = new SavingsAccount("SA101", 10000.0, 4.5);
        savings.displayAccountType();
        System.out.println();

        CheckingAccount checking = new CheckingAccount("CA101", 8000.0, 5000.0);
        checking.displayAccountType();
        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount("FD101", 25000.0, 12);
        fd.displayAccountType();
    }
}
