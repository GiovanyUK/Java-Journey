package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Make Contact objects for later
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact bob = Contact.createContact("Bob", "31415926");
        Contact jim = Contact.createContact("Jim", "2223334444");
        Contact jimWithNewNumber = Contact.createContact("Jim", "8382210047");

        //Adding contact objects to an arrayList
        ArrayList<Contact> myContacts = new ArrayList<Contact>();
        myContacts.add(alice);
        myContacts.add(bob);
        myContacts.add(jim);

        System.out.println("Testing contact creation: ");
        for (var contact:myContacts) {
            System.out.println(contact.getName() + " : " + contact.getPhoneNumber());
        }
        System.out.println();


        //Testing phone creation and adding contacts
        String myNumber = "111-111-1111";
        MobilePhone mobilePhone = new MobilePhone(myNumber);

        System.out.println("Adding contacts to phone: ");
        mobilePhone.addNewContact(alice);
        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(jim);

        //Make sure this matches the format the challenge wants
        mobilePhone.printContacts();
        System.out.println();

        //Testing Update
        System.out.println("Making sure Jim's number changed:  ");
        mobilePhone.updateContact(jim, jimWithNewNumber);
        mobilePhone.printContacts();
        System.out.println();

        //Testing remove
        System.out.println("Removing Alice:  ");
        mobilePhone.removeContact(alice);
        mobilePhone.printContacts();
        System.out.println();

        //Testing query, note the search is case-sensitive
        System.out.println("Looking for Jim:  ");
        System.out.println(mobilePhone.queryContact("Jim"));
        System.out.println();
        System.out.println("Alice should be gone:  ");
        System.out.println(mobilePhone.queryContact("Alice"));
    }
}