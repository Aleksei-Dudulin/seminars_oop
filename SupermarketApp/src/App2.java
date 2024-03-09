import Classes.*;
import Interfaces.iActorBehaviour;

public class App2 {
    public static void main(String[] args) {

        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Вася"); // тут полиморфизм используется
        iActorBehaviour client2 = new SpecialClient("Баста", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
