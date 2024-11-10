package lab5;

import java.util.HashMap;
import java.util.Scanner;

public class MasterManager {
    private HashMap<Integer, String> masters = new HashMap<>();

    public void addMaster(int id, String name) {
        if (masters.containsKey(id)) {
            System.out.println("Майстер з таким ID вже існує.");
        } else {
            masters.put(id, name);
            System.out.println("Майстер доданий.");
        }
    }

    public void updateMaster(int id, String newName) {
        if (masters.containsKey(id)) {
            masters.put(id, newName);
            System.out.println("Інформацію про майстра оновлено.");
        } else {
            System.out.println("Майстер не знайдений.");
        }
    }

    public void deleteMaster(int id) {
        if (masters.remove(id) != null) {
            System.out.println("Майстра видалено.");
        } else {
            System.out.println("Майстер не знайдений.");
        }
    }

    public void viewMasters() {
        if (masters.isEmpty()) {
            System.out.println("Список майстрів порожній.");
        } else {
            System.out.println("Список майстрів:");
            masters.forEach((id, name) -> System.out.println("ID: " + id + ", Ім'я: " + name));
        }
    }
}

