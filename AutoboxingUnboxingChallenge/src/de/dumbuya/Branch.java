package de.dumbuya;
// Branch:
// Each Branch should have an arraylist of Customers
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String name, Double initialAmount) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, Double amount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(amount);
        return true;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer queryCustomer = this.customers.get(i);
            if (queryCustomer.getName().equals(customerName)) {
                return queryCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
