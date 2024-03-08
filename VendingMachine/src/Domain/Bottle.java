package Domain;

public class Bottle extends Product {
    private float bottleVolume;

    public Bottle(Double price, Integer place, String name, float bottleVolume) {
        super(price, place, name);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume " + bottleVolume;
    }
}
