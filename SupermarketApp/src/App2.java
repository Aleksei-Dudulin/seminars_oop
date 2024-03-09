import Classes.*;
import Interfaces.iActorBehaviour;

public class App2 {
    public static void main(String[] args) {

        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Вася"); // тут полиморфизм используется
        iActorBehaviour client2 = new OrdinaryClient("Петя");
        iActorBehaviour client3 = new SpecialClient("Баста", 1);
        iActorBehaviour client7 = new SpecialClient("Земфира", 2);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new PromotionClient("Игорь", 1, "Чёрная пятница");
        iActorBehaviour client6 = new PromotionClient("Андрей", 2, "Чёрная пятница");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();

        client1.returnOrder();
        client3.returnOrder();
        client5.returnOrder();

    }
}
