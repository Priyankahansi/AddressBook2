package com.bridgelabz;

import java.util.Scanner;

public class Contacts {
    static Contacts contacts[] = new Contacts[2];
    static String firstName;
    static String lastName;
    static String fullAddress;
    static long zip;
    static long phoneNumber;
    static String email;

    public Contacts() {
        Scanner input = new Scanner(System.in);//taking input from user

        System.out.println("Enter first Name");
        firstName = input.next();

        System.out.println("Enter last Name");
        lastName = input.next();

        System.out.println("Enter full Address wit city and state");
        fullAddress = input.next();

        System.out.println("Enter Email");
        email = input.next();

        System.out.println("Enter Zip Code");
        zip = input.nextLong();

        System.out.println("Enter Phone Number");
        phoneNumber = input.nextLong();
    }

    public static void newContact(int index) {
        if (index < contacts.length) {
            contacts[index] = new Contacts();
        } else {
            System.out.println("Contact list is full");
        }
        return;
    }

    @Override
    public String toString() {
        return "AddingContact;[getFirstName()=" + getFirstName() + ",getLastName()=" + getLastName() + ",getFullAddress()=" + getFullAddress() + "getzip()=" + getZip() + "getPhoneNumber()=" + getPhoneNumber() + "getEmail()=" + getEmail() + "]";
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private String getFullAddress() {
        return fullAddress;
    }

    private String getEmail() {
        return email;
    }

    private long getZip() {
        return zip;
    }

    private long getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;

    }

}








