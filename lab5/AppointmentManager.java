package lab5;

import java.util.Scanner;
import java.util.TreeMap;

public class AppointmentManager {
    private TreeMap<Integer, String> appointments = new TreeMap<>();

    public void addAppointment(int id, String details) {
        if (appointments.containsKey(id)) {
            System.out.println("Запис з таким ID вже існує.");
        } else {
            appointments.put(id, details);
            System.out.println("Запис доданий.");
        }
    }

    public void updateAppointment(int id, String newDetails) {
        if (appointments.containsKey(id)) {
            appointments.put(id, newDetails);
            System.out.println("Інформацію про запис оновлено.");
        } else {
            System.out.println("Запис не знайдений.");
        }
    }

    public void deleteAppointment(int id) {
        if (appointments.remove(id) != null) {
            System.out.println("Запис видалено.");
        } else {
            System.out.println("Запис не знайдений.");
        }
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("Список записів порожній.");
        } else {
            System.out.println("Список записів:");
            appointments.forEach((id, details) -> System.out.println("ID: " + id + ", Деталі: " + details));
        }
    }
}
