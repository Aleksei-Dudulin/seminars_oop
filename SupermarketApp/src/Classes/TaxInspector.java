package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    public void setMakeOrder(boolean value) {
        this.isMakeOrder = value;
    }

    public void setTakeOrder(boolean value) {
        this.isTakeOrder = value;
    }

    @Override
    public Actor getActor() {
//        return new OrdinaryClient("Налоговый инспектор");
        return new OrdinaryClient(this.getName());
    }
}
