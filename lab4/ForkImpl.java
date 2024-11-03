package lab4;

public class ForkImpl implements Fork {
    private String material;
    private String brand;

    public ForkImpl(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    @Override
    public void viewByBrand(String brand) {
        System.out.println("Viewing forks of brand: " + brand);
    }

    @Override
    public void changeMaterial(String newMaterial) {
        this.material = newMaterial;
        System.out.println("Material changed to: " + newMaterial);
    }

    @Override
    public void manufactureBatch(int quantity) {
        System.out.println("Manufacturing batch of " + quantity + " forks.");
    }

    @Override
    public void stopProduction() {
        System.out.println("Production stopped for forks.");
    }

    @Override
    public void createProductionContract(String client) {
        System.out.println("Production contract created for client: " + client);
    }

    @Override
    public double estimateCost() {
        double cost = 10.0;
        System.out.println("Estimated cost: " + cost);
        return cost;
    }

    @Override
    public void restore() {
        System.out.println("Forks restored.");
    }

    @Override
    public void sharpenTines() {
        System.out.println("Fork tines sharpened.");
    }
}

