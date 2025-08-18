package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in address book.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
}
