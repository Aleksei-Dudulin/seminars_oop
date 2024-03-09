package Classes;

public class OrdinaryClient extends Actor{
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

    boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    void setMakeOrder(boolean value) {
        super.isMakeOrder = value;
    }

    void setTakeOrder(boolean value) {
        super.isTakeOrder = value;
    }

    Actor getActor() {
        return this;
    }
}
