package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialTransactions) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransactions);
}

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transactionAmount) {

        this.transactions.add(transactionAmount);
    }


}

