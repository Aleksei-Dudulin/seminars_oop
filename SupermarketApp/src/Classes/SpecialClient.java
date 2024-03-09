package Classes;

import Interfaces.iActorBehaviour;

public class SpecialClient extends Actor implements iActorBehaviour {
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean value) {
        super.isMakeOrder = value;
    }

    public void setTakeOrder(boolean value) {
        super.isTakeOrder = value;
    }

    public Actor getActor() {
        return this;
    }
    /**
     * Метод возврата товара особого клиента (реализация)
     */
    public void returnOrder() {
        System.out.println(name + " особый клиент вернул товары");
    }
}
