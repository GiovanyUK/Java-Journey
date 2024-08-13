package dev.lpa;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }



    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameCustomer, double transaction) {
        if (findCustomer(nameCustomer) == null) {
            customers.add(new Customer(nameCustomer, transaction));
            return true;
        }
        else
            return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {

        for (Customer checkedCustomers : customers) {
            if (checkedCustomers.getName().equals(name)) {
                return checkedCustomers;
            }
        }
        return null;
    }
}