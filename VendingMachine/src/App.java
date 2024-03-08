import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Service.CoinDispenser;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        Product item1 = new Product(50.5, 1, "mars");
        Product item2 = new Product(80.5, 2, "nuts");
        Product item3 = new Product(120.5, 3, "lays");
        Bottle item4 = new Bottle(123.5, 4, "cola", 0.5f);
        Bottle item5 = new Bottle(13.5, 5, "fanta", 0.6f);
        HotDrink item6 = new HotDrink(45.5, 6, "coffee", 60);
        HotDrink item7 = new HotDrink(45.5, 7, "tea", 55);

        List<Product> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);

        Holder hold = new Holder();
        Display disp = new Display();
        CoinDispenser coinDisp = new CoinDispenser();
        VendingMachine vendMachine = new VendingMachine(hold, disp, coinDisp, items);

        for (Product prod : vendMachine.getProductList()){
            System.out.println(prod);
        }

    }
}
