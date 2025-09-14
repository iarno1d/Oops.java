package Oops;
// Abstraction
abstract class Account {
    int balance = 1000;
    abstract void withdraw(int amt);
}

// Inheritance + Polymorphism
class SavingAccount extends Account {
    void withdraw(int amt) {
        if (balance - amt >= 500) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Encapsulation
class Bank {
    private String bankName = "SBI";
    public String getBankName() { return bankName; }
}

class AllOops {
    public static void main(String[] args) {
        Account acc = new SavingAccount();
        acc.withdraw(300); // polymorphism
        acc.withdraw(600);

        Bank b = new Bank();
        System.out.println("Bank Name: " + b.getBankName());
    }
}