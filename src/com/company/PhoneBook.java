package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Contact> storage = new HashMap<>();


    public void addContact(String phoneNumber, Contact contact) {
        storage.put(phoneNumber, contact);
    }

    public Contact findByNumber(String phoneNumber) {
        return storage.get(phoneNumber);
    }

    public void showPhoneBook() {

        System.out.println("Список контактов:");
        for (Map.Entry<String, Contact> kv : storage.entrySet()) {
            System.out.println(kv.getValue());
        }
        System.out.println("\n");
    }

}
