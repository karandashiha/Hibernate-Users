package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserCreateView {

    // Отримуємо вхідні дані
    public Map<String, String> getData() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Enter first name: ");
        data.put("first_name", scanner.nextLine().trim());
        System.out.print("Enter last name: ");
        data.put("last_name", scanner.nextLine().trim());
        System.out.print("Enter email in format example@gmail.com: ");
        data.put("email", scanner.nextLine().trim());
        return data;
    }

    // Виведення результату роботи програми
    public void getOutput(String output) {
        System.out.println(output);
    }
}
