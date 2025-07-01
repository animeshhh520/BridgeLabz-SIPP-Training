package Inheritance.Bank_Account_types;
class FixedDepositAccount extends BankAccount {
    int depositPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayCommonDetails();
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}

