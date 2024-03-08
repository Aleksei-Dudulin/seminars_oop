package Domain;

public class HotDrink extends Product{
    private Integer temperature;

    public HotDrink(Double price, Integer place, String name, Integer temperature) {
        super(price, place, name);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature " + temperature;
    }
}
