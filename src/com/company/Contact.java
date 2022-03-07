package com.company;

import java.util.Objects;

public class Contact {

    public String name;
    public String surname;

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        Contact contact = (Contact) obj;
        return name.equals(contact.name) && surname.equals(contact.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
