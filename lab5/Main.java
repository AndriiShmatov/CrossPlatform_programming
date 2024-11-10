package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClientManager clientManager = new ClientManager();
        ServiceManager serviceManager = new ServiceManager();
        MasterManager masterManager = new MasterManager();
        AppointmentManager appointmentManager = new AppointmentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Система управління перукарнею ---");
            System.out.println("1. Управління клієнтами");
            System.out.println("2. Управління послугами");
            System.out.println("3. Управління майстрами");
            System.out.println("4. Управління записами");
            System.out.println("0. Вихід");
            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Читання символу переходу на новий рядок

            switch (choice) {
                case 1 -> manageClients(clientManager, scanner);
                case 2 -> manageServices(serviceManager, scanner);
                case 3 -> manageMasters(masterManager, scanner);
                case 4 -> manageAppointments(appointmentManager, scanner);
                case 0 -> {
                    System.out.println("Вихід з програми.");
                    return;
                }
                default -> System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    private static void manageClients(ClientManager clientManager, Scanner scanner) {
        System.out.println("\n--- Управління клієнтами ---");
        System.out.println("1. Додати клієнта");
        System.out.println("2. Оновити клієнта");
        System.out.println("3. Видалити клієнта");
        System.out.println("4. Переглянути всіх клієнтів");
        System.out.print("Виберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Введіть ID клієнта: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть ім'я клієнта: ");
                String name = scanner.nextLine();
                clientManager.addClient(id, name);
            }
            case 2 -> {
                System.out.print("Введіть ID клієнта: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть нове ім'я клієнта: ");
                String newName = scanner.nextLine();
                clientManager.updateClient(id, newName);
            }
            case 3 -> {
                System.out.print("Введіть ID клієнта: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                clientManager.deleteClient(id);
            }
            case 4 -> clientManager.viewClients();
            default -> System.out.println("Невірний вибір.");
        }
    }

    private static void manageServices(ServiceManager serviceManager, Scanner scanner) {
        System.out.println("\n--- Управління послугами ---");
        System.out.println("1. Додати послугу");
        System.out.println("2. Оновити послугу");
        System.out.println("3. Видалити послугу");
        System.out.println("4. Переглянути всі послуги");
        System.out.print("Виберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Введіть назву послуги: ");
                String service = scanner.nextLine();
                serviceManager.addService(service);
            }
            case 2 -> {
                System.out.print("Введіть індекс послуги: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть нову назву послуги: ");
                String newService = scanner.nextLine();
                serviceManager.updateService(index, newService);
            }
            case 3 -> {
                System.out.print("Введіть індекс послуги: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                serviceManager.deleteService(index);
            }
            case 4 -> serviceManager.viewServices();
            default -> System.out.println("Невірний вибір.");
        }
    }

    private static void manageMasters(MasterManager masterManager, Scanner scanner) {
        System.out.println("\n--- Управління майстрами ---");
        System.out.println("1. Додати майстра");
        System.out.println("2. Оновити майстра");
        System.out.println("3. Видалити майстра");
        System.out.println("4. Переглянути всіх майстрів");
        System.out.print("Виберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Введіть ID майстра: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть ім'я майстра: ");
                String name = scanner.nextLine();
                masterManager.addMaster(id, name);
            }
            case 2 -> {
                System.out.print("Введіть ID майстра: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть нове ім'я майстра: ");
                String newName = scanner.nextLine();
                masterManager.updateMaster(id, newName);
            }
            case 3 -> {
                System.out.print("Введіть ID майстра: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                masterManager.deleteMaster(id);
            }
            case 4 -> masterManager.viewMasters();
            default -> System.out.println("Невірний вибір.");
        }
    }

    private static void manageAppointments(AppointmentManager appointmentManager, Scanner scanner) {
        System.out.println("\n--- Управління записами ---");
        System.out.println("1. Додати запис");
        System.out.println("2. Оновити запис");
        System.out.println("3. Видалити запис");
        System.out.println("4. Переглянути всі записи");
        System.out.print("Виберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Введіть ID запису: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть деталі запису: ");
                String details = scanner.nextLine();
                appointmentManager.addAppointment(id, details);
            }
            case 2 -> {
                System.out.print("Введіть ID запису: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введіть нові деталі запису: ");
                String newDetails = scanner.nextLine();
                appointmentManager.updateAppointment(id, newDetails);
            }
            case 3 -> {
                System.out.print("Введіть ID запису: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                appointmentManager.deleteAppointment(id);
            }
            case 4 -> appointmentManager.viewAppointments();
            default -> System.out.println("Невірний вибір.");
        }
    }
}
