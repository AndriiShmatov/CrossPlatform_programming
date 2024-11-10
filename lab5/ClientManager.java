package lab5;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ClientManager {
    private HashMap<Integer, String> clients = new HashMap<>();
    private static final String CLIENTS_FILE = "clients.txt";

    public ClientManager() {
        loadClients();
    }

    public void addClient(int id, String name) {
        if (clients.containsKey(id)) {
            System.out.println("Клієнт з таким ID вже існує.");
        } else {
            clients.put(id, name);
            System.out.println("Клієнт доданий.");
            saveClients();
        }
    }

    public void updateClient(int id, String newName) {
        if (clients.containsKey(id)) {
            clients.put(id, newName);
            System.out.println("Інформацію про клієнта оновлено.");
            saveClients();
        } else {
            System.out.println("Клієнт не знайдений.");
        }
    }

    public void deleteClient(int id) {
        if (clients.remove(id) != null) {
            System.out.println("Клієнта видалено.");
            saveClients();
        } else {
            System.out.println("Клієнт не знайдений.");
        }
    }

    public void viewClients() {
        if (clients.isEmpty()) {
            System.out.println("Список клієнтів порожній.");
        } else {
            System.out.println("Список клієнтів:");
            clients.forEach((id, name) -> System.out.println("ID: " + id + ", Ім'я: " + name));
        }
    }

    private void saveClients() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CLIENTS_FILE))) {
            clients.forEach((id, name) -> writer.println(id + "," + name));
        } catch (IOException e) {
            System.out.println("Помилка збереження клієнтів.");
        }
    }

    private void loadClients() {
        try (Scanner scanner = new Scanner(new File(CLIENTS_FILE))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                clients.put(Integer.parseInt(data[0]), data[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл клієнтів не знайдено, створюється новий.");
        }
    }
}
