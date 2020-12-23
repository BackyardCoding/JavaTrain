package de.dumbuya;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<>();
    private int mobilePhone;

    public MobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
        this.contactList = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("The contact does already exist");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " wasn't found.");
            return false;
        }
        this.contactList.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contactList.get(position);
        }
        return null;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + " couldn't be found.");
            return false;
        }
        this.contactList.remove(position);
        System.out.println(contact.getName() + " was removed.");
        return true;
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " entries in your contact list.");
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println("Name: " + contactList.get(i).getName() + ", Phone: " + contactList.get(i).getPhoneNumber());
        }
    }

    public ArrayList<Contact> getContactsList() {
        return contactList;
    }
}
