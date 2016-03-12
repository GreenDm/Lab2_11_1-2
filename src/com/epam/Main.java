package com.epam;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Vova", "80930231967");
        phoneBook.addPhoneNumber("Vova1", "80930231965");
        phoneBook.addPhoneNumber("Vova2", "80930231957");
        phoneBook.addPhoneNumber("Vova3", "80930235967");
        phoneBook.addPhoneNumber("Vova4", "80930251967");
        phoneBook.addPhoneNumber("Vova5", "80935231967");
        phoneBook.addPhoneNumber("Vova6", "80950231967");
        phoneBook.addPhoneNumber("Vova7", "80530231967");
        phoneBook.addPhoneNumber("Vova8", "80960231967");
        phoneBook.addPhoneNumber("Vova9", "80970231967");

        phoneBook.printPhoneBook();
        System.out.println("by name");
        phoneBook.sortByName();
        phoneBook.printPhoneBook();
        System.out.println("by phone");
        phoneBook.sortByPhoneNumber();
        phoneBook.printPhoneBook();

    }
}
