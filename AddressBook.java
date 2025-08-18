package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void editContact(String firstName, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                contacts.set(i, updatedContact);
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // 🔹 UC3: Delete a contact by first name
    public void deleteContact(String firstName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
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
