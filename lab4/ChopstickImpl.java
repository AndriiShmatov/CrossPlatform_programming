package lab4;

public class ChopstickImpl implements Chopstick {
    private String material;
    private String brand;

    public ChopstickImpl(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    @Override
    public void viewByBrand(String brand) {
        System.out.println("Viewing chopsticks of brand: " + brand);
    }

    @Override
    public void changeMaterial(String newMaterial) {
        this.material = newMaterial;
        System.out.println("Material changed to: " + newMaterial);
    }

    @Override
    public void manufactureBatch(int quantity) {
        System.out.println("Manufacturing batch of " + quantity + " chopsticks.");
    }

    @Override
    public void stopProduction() {
        System.out.println("Production stopped for chopsticks.");
    }

    @Override
    public void createProductionContract(String client) {
        System.out.println("Production contract created for client: " + client);
    }

    @Override
    public double estimateCost() {
        double cost = 5.0;
        System.out.println("Estimated cost: " + cost);
        return cost;
    }

    @Override
    public void restore() {
        System.out.println("Chopsticks restored.");
    }

    @Override
    public void polish() {
        System.out.println("Chopsticks polished.");
    }
}

