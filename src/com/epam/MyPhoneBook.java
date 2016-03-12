package com.epam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    private int arrayIndex = 0;

    public void addPhoneNumber(String name, String phone){

        if(arrayIndex<phoneNumbers.length){ PhoneNumber phoneNumber = new PhoneNumber(name, phone);

            phoneNumbers [arrayIndex] = phoneNumber;
            arrayIndex++;
        }
    }
    public void printPhoneBook(){

        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);

        }
    }

    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }
    public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });

    }

    static class PhoneNumber{

        private String name;
        private  String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: " + name +
                    ", phone:" + phone;
        }
    }

}
