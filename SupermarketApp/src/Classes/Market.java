package Classes;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder) {
                actor.isMakeOrder = true;
                System.out.println(actor.getName() + " клиент сделал заказ ");

            }
        }
    }
}
