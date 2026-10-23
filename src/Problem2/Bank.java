package Problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name=name;
        customers=new ArrayList<>();
    }

    public void addCustomer(Customer c){
        if (!customers.contains(c)){
            customers.add(c);
        }
        else {
            System.out.println("Customer already exists");
        }
    }
    public void addTransaction(String name,double amount){
        for (Customer c:customers){
            if(c.getName().equalsIgnoreCase(name)){
                c.addToTransaction(amount);
                return;
            }
        }
        System.out.println("Customer not found");


    }
    public void printTransactions(String name){
        for (Customer c:customers){
            if(c.getName().equalsIgnoreCase(name)){
                System.out.println("Customer: "+c.getName());
                for (Double transaction:c.getTransactions()){
                    double transac=transaction;
                    System.out.println(transac);
                }
                return;
            }
        }
        System.out.println("Customer not found");
    }


}
