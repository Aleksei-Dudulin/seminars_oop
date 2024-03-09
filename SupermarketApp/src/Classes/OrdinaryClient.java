package Classes;

import Interfaces.iActorBehaviour;

public class OrdinaryClient extends Actor implements iActorBehaviour {
    public OrdinaryClient(String name) {
        super(name);
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
     * Метод возврата товара обычного клиента (реализация)
     */
    public void returnOrder() {
        System.out.println(name + " клиент вернул товары");
    }
}
