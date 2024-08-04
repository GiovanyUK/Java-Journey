package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return  false;

    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(myContacts.contains(oldContact)) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean removeContact(Contact contact) {
        if(myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        return  findContact(contact.getName());
    }

    //Return the index of the found contact
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if (index == -1) {
            return  null;
        }
        return myContacts.get(index);
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            Contact contact = (Contact) myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i + 1, contact.getName(), contact.getPhoneNumber());
        }
    }
}

