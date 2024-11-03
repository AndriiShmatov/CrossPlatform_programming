package lab4;

public interface Utensils {
    void viewByBrand(String brand);
    void changeMaterial(String newMaterial);
    void manufactureBatch(int quantity);
    void stopProduction();
    void createProductionContract(String client);
    double estimateCost();
    void restore();
}

interface Fork extends Utensils {
    void sharpenTines(); // метод для загострення зубців
}

interface Knife extends Utensils {
    void sharpenBlade(); // метод для заточування леза
}

interface Chopstick extends Utensils {
    void polish(); // метод для полірування паличок
}
