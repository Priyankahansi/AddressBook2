package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressMain {
    public static void main(String[] args) {
        Contacts contact = new Contacts("Praju", "Hanasi", "aaa@123",
                "99999", "Hosa oni", 580001, "karanataka", "Dharwad");

        Contacts contact1 = new Contacts("Paru", "Hanasi", "aaa@123",
                "99999", "Hosa oni", 580001, "karanataka", "Dharwad");

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(contact);
        contactsList.add(contact1);
        System.out.println(contactsList);
    }
}
