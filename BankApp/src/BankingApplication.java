class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void printName() {
        System.out.println("Name:" + name);
    }
    void showSummary() {
        printName();
        System.out.println("balance:" + balance);
    }
        }

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }
    void showSummary() {
        super.showSummary();
        System.out.println("Interest Rate:" + interestRate);
    }
}
public class BankingApplication {

    static void main() {
        SavingsAccount s1 = new SavingsAccount("Dhruv", 10, 2.5);
        s1.showSummary();
        BankAccount s2 = new SavingsAccount("Trump", 0, 2.5);
        s2.showSummary();
    }

}
