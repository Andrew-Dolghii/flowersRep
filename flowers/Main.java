package andrew.flowers;

public class Main {
    public static void main(String[] args) {

        Bouqet bouqet = new Bouqet(5);

        Flower rose = new Rose();
        Flower lily = new Lily();
        Flower chrysanthemum = new Chrysanthemum();
        Flower peony = new Peony();
        Flower orchid = new Orchid();

        bouqet.addFlower(rose);
        bouqet.addFlower(lily);
        bouqet.addFlower(chrysanthemum);
        bouqet.addFlower(peony);
        bouqet.addFlower(orchid);

        Printer.printBouqet(bouqet.getFlowers());
        Printer.printPrice(bouqet.getBouqetCost());

    }
}
