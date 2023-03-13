package andrew.flowers;

public class Printer {

    public static void printBouqet(Flower[] flowers){
        StringBuilder str = new StringBuilder(flowers.length);
        str.append("Bouqet consists of the following flowers: ");
        for(Flower flower : flowers){
            str.append(flower.getName());
            str.append(" ");
        }
        System.out.println(str.toString());
    }

    public static void printPrice(int price){
        System.out.println("Price of this bouqet: " + price);
    }
}
