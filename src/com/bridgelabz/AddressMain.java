package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressMain {
    public static void main(String[] args) {
        Contacts contact = new Contacts("Praju","Hanasi","aaa@123",
                "99999","Hosa oni",580001,"karanataka","Dharwad");
        System.out.println(contact.getFirstname());
        System.out.println(contact.getLastname());
        System.out.println(contact.getAddress());
        System.out.println(contact.getEmail());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getZip());
        System.out.println(contact.getState());
        System.out.println(contact.getCity());
    }
}
