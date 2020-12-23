package de.dumbuya;
/*
 Master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
* Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
* A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
* And seven methods, they are (their functions are in their names):
* addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
* updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
* removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
* findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).* findContact(), same as above, only it has one parameter of type String.
* queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
* printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
 */

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " does already exist.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(newContact.getName() + " was successfully modified");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.myContacts.remove(position);
            System.out.println(contact.getName() + " was removed");
            return true;
        }
        System.out.println(contact.getName() + " was not found");
        return false;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position < 0) {
            System.out.println("Contact does not exist");
            return null;
        }
        return myContacts.get(position);
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1+". "+ this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
