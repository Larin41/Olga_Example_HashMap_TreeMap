package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        MissedCalls mc = new MissedCalls();

        //Заполним адресную книгу
        pb.addContact("111111111", new Contact("Евгений", "Александров"));
        pb.addContact("222222222", new Contact("Александр", "Степанов"));
        pb.addContact("333333333", new Contact("Ольга", "Иванова"));
        pb.addContact("444444444", new Contact("Олег", "Лунёв"));
        pb.addContact("555555555", new Contact("Инга", "Петрова"));

        pb.showPhoneBook();

        //Добавим пропущенные вызовы
        mc.addMissedCall(LocalDateTime.of(2022, 1, 1, 12, 0), "111111111");
        mc.addMissedCall(LocalDateTime.of(2021, 2, 1, 12, 0), "333333333");
        mc.addMissedCall(LocalDateTime.of(2023, 3, 1, 12, 0), "888888888"); //Этот номер не существует в телефонной книге
        mc.addMissedCall(LocalDateTime.of(2024, 4, 1, 12, 0), "222222222");
        mc.addMissedCall(LocalDateTime.of(2020, 5, 1, 12, 0), "444444444");
        mc.addMissedCall(LocalDateTime.of(2025, 6, 1, 12, 0), "555555555");

        mc.showMissedCalls(pb);


    }
}
