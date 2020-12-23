package de.dumbuya;

import java.util.Scanner;

/*
A program that implements a simple mobile phone with the following capabilities.
*/
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("91943822");

    public static void main(String[] args) {
        boolean quit = false;
        bootMobilePhone();
        printInstructions();
        while (!quit) {
            System.out.println("Enter a choice (enter 0 to see instructions)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    contactQuery();
                    break;
                case 6:
                    quit = true;
                    shutdownMobilePhone();
                    break;
            }
        }
    }

    private static void bootMobilePhone() {
        System.out.println("The mobile phone is booting ...");
    }

    private static void printInstructions() {
        System.out.println("\nEnter a number and press enter to choose an option");
        System.out.println("You have the following options");
        System.out.println("Press 0 - See instructions");
        System.out.println("Press 1 - See all your contacts");
        System.out.println("Press 2 - Add contact");
        System.out.println("Press 3 - Modify contact");
        System.out.println("Press 4 - Remove Contact");
        System.out.println("Press 5 - Search for contact");
        System.out.println("Press 6 - Shutdown mobile phone\n");
    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("The contact was successfully added");
        }
    }

    private static void modifyContact() {
        System.out.println("Enter the name of the contact you want to modify: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            return;
        }
        System.out.println("Modify the contact");
        System.out.println("Enter a name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, phoneNumber);
        if (!mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("An error happened while updating the contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the name of the contact you want to remove: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println(name + " the contact could not be found");
            return;
        }
        if (mobilePhone.removeContact(contact)) {
            System.out.println("The removal was successful");
        }
    }

    private static void contactQuery() {
        System.out.println("Enter the name of the contact you want to query: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println(name + " contact could not be found.");
            return;
        }
        System.out.println("Query result '" + name + "': ");
        System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
    }

    private static void shutdownMobilePhone() {
        System.out.println("The mobile is shutting down.");
    }
}
