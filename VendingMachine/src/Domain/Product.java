package Domain;

public class Product {
    private Double price;
    private Integer place;
    private String name;

    public Product(Double price, Integer place, String name) {
        if (price < 0) {
            this.price = 100.0;
        } else {
            this.price = price;
        }
        this.place = place;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            this.price = 100.0;
        } else {
            this.price = price;
        }
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", place=" + place +
                ", name='" + name + '\'' +
                '}';
    }
}
