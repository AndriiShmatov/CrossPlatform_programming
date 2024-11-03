package lab4;

public class Main {
    public static void main(String[] args) {
        Fork fork = new ForkImpl("FancyBrand", "Stainless Steel");
        Knife knife = new KnifeImpl("SharpBrand", "Carbon Steel");
        Chopstick chopstick = new ChopstickImpl("ElegantBrand", "Bamboo");

        // Використання методів
        fork.viewByBrand("FancyBrand");
        fork.sharpenTines();
        fork.changeMaterial("Titanium");

        knife.viewByBrand("SharpBrand");
        knife.sharpenBlade();
        knife.estimateCost();

        chopstick.viewByBrand("ElegantBrand");
        chopstick.polish();
        chopstick.estimateCost();
    }
}

