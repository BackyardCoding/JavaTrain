package de.dumbuya;
// Bank:
// There should be a Bank class
// It should have an arraylist of Branches
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branch) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branch)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean addCustomer(String branchName, String costumerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(costumerName, initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String costumerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(costumerName, amount);
        }
        return false;
    }

    public boolean showCostumers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer List for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transaction");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            System.out.println("There are no costumers to show");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
