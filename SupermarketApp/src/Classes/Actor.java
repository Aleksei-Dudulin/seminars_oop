package Classes;

public abstract class Actor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

    abstract public void setName(String name);
}
