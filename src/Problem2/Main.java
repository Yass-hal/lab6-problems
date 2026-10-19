package Problem2;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Bank");

        Customer c1 = new Customer("Yasser");
        Customer c2 = new Customer("Kenza");
        Customer c3 = new Customer("Mohamed");

        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);
        bank.addCustomer(c1);

        bank.addTransaction("Yasser", 100);
        bank.addTransaction("Yasser", -30);
        bank.addTransaction("Kenza", 500);
        bank.addTransaction("Kenza", -150);
        bank.addTransaction("Mohamed", 200);

        bank.printTransactions("Yasser");
        bank.printTransactions("Kenza");
        bank.printTransactions("Mohamed");
    }
}


