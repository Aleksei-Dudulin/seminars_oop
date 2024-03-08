package Service;

import Domain.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDispenser coin;
    private List<Product> productList;

    public VendingMachine(Holder holder, Display display, CoinDispenser coin, List<Product> productList) {
        this.holder = holder;
        this.display = display;
        this.coin = coin;
        this.productList = productList;
    }

    public Holder getHolder() {
        return holder;
    }

    public Display getDisplay() {
        return display;
    }

    public CoinDispenser getCoin() {
        return coin;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
