package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCall(LocalDateTime dateTime, String phoneNumber) {
        storage.put(dateTime, phoneNumber);
    }

    public void showMissedCalls(PhoneBook pb) {

        System.out.println("Списко пропущенных вызовов:");
        for (Map.Entry<LocalDateTime, String> kv : storage.entrySet()) {
            Contact contact = pb.findByNumber(kv.getValue());
            System.out.printf("В %s был пропущен вызов от %s \n", kv.getKey(), (contact != null) ? contact : kv.getValue());
        }
        System.out.println("\n");

    }
}
