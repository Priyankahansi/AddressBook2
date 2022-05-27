package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressMain {

    List<Contacts> contactsList = new ArrayList<>();
    void addNewContact(){
        Contacts contacts = new Contacts();
        contacts.addContact();
        contactsList.add(contacts);
        contacts.displayContact();
    }
    public static void main(String[] args) {
        AddressMain addressBook = new AddressMain();
        addressBook.addNewContact();
    }
}
