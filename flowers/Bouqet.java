package andrew.flowers;

public class Bouqet implements IBouqet{

    private Flower[] flowers;

    public Bouqet(int count){
        flowers = new Flower[count];
    }

    public Flower[] getFlowers(){
        return this.flowers;
    }

    @Override
    public void addFlower(Flower flower){
        if(Checker.checkLength(this.flowers)){
            int position = Checker.getPosition(this.flowers);
            this.flowers[position] = flower;
        }
        else{
            System.out.println("Error! Not enough space");
        }
    }

    @Override
    public int getBouqetCost() {
        int result = 0;

        for(Flower flower : this.flowers){
            if(flower != null)
                result += flower.getPrice();
            else
                break;
        }

        return result;
    }
}
