package Problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name){
        this.name=name;
        transactions=new ArrayList<>();
    }


    public String getName() {
        return name;
    }
    public void addToTransaction(double amount){
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
