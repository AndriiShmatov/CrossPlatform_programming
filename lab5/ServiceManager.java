package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceManager {
    private ArrayList<String> services = new ArrayList<>();

    public void addService(String service) {
        services.add(service);
        System.out.println("Послугу додано.");
    }

    public void updateService(int index, String newService) {
        if (index >= 0 && index < services.size()) {
            services.set(index, newService);
            System.out.println("Послугу оновлено.");
        } else {
            System.out.println("Послуга не знайдена.");
        }
    }

    public void deleteService(int index) {
        if (index >= 0 && index < services.size()) {
            services.remove(index);
            System.out.println("Послугу видалено.");
        } else {
            System.out.println("Послуга не знайдена.");
        }
    }

    public void viewServices() {
        if (services.isEmpty()) {
            System.out.println("Список послуг порожній.");
        } else {
            System.out.println("Список послуг:");
            for (int i = 0; i < services.size(); i++) {
                System.out.println(i + ". " + services.get(i));
            }
        }
    }
}
