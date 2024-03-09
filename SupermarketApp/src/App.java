import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) {

        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("Вася"); // тут полиморфизм используется
        Actor client2 = new SpecialClient("Баста", 1);

        magnit.acceptToMarket(client1);
//        magnit.acceptToMarket(client2);

        magnit.update();
    }
}
