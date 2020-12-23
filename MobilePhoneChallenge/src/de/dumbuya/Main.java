package de.dumbuya;

import java.util.Random;
import java.util.Scanner;

// A program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// A separate class for Contacts (name and phone number).
// A master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner w                                                                                                          orkings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone(91943822);

    public static void main(String[] args) {
        startPhone();
        boolean quit = false;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice (Press 0 to see the available options):");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }


        }

    }

    private static void startPhone() {
        System.out.println("The phone is starting...");
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the full contact list.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addNewContact() {
        System.out.println("Create a new contact");
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        System.out.println("Enter a phone number:");
        int phoneNumber = scanner.nextInt();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println(name + " was added to the list.");
        } else {
            System.out.println("Cannot add " + name + " does already exist.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of thee contact to be updated");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("The contact wasn't found.");
            return;
        }
        System.out.println("Enter a new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter a new phone number:");
        int newNumber = scanner.nextInt();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }

    }

    private static void removeContact() {
        System.out.println("Enter the name of a contact you want to remove:");
        String queryName = scanner.nextLine();
        Contact queryContact = mobilePhone.queryContact(queryName);
        if (queryContact == null) {
            System.out.println("The contact " + queryName + " wasn't found.");
            return;
        }
        if (mobilePhone.removeContact(queryContact)) {
            System.out.println("The contact was removed successfully.");
        } else {
            System.out.println("Error removing contact.");
        }

    }

    private static void searchForContact() {
        System.out.println("Enter the name of a contact you a searching for");
        String queryName = scanner.nextLine();
        Contact queryContact = mobilePhone.queryContact(queryName);
        if (queryContact == null) {
            System.out.println("The contact " + queryName + " wasn't found.");
        } else {
            System.out.println("Results of query for '" + queryName + "'.");
            System.out.println("Name: " + queryContact.getName());
            System.out.println("Mobile Phone: " + queryContact.getPhoneNumber());
        }
    }
}
