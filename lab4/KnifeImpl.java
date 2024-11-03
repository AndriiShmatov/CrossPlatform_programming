package lab4;

public class KnifeImpl implements Knife {
    private String material;
    private String brand;

    public KnifeImpl(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    @Override
    public void viewByBrand(String brand) {
        System.out.println("Viewing knives of brand: " + brand);
    }

    @Override
    public void changeMaterial(String newMaterial) {
        this.material = newMaterial;
        System.out.println("Material changed to: " + newMaterial);
    }

    @Override
    public void manufactureBatch(int quantity) {
        System.out.println("Manufacturing batch of " + quantity + " knives.");
    }

    @Override
    public void stopProduction() {
        System.out.println("Production stopped for knives.");
    }

    @Override
    public void createProductionContract(String client) {
        System.out.println("Production contract created for client: " + client);
    }

    @Override
    public double estimateCost() {
        double cost = 15.0;
        System.out.println("Estimated cost: " + cost);
        return cost;
    }

    @Override
    public void restore() {
        System.out.println("Knives restored.");
    }

    @Override
    public void sharpenBlade() {
        System.out.println("Knife blade sharpened.");
    }
}

