public class Task_5 {

    /**
     * Переписать код в соответствии с Dependency Inversion Principle.
     */
//    public class Car {
//        private PetrolEngine engine;
//        public Car(PetrolEngine engine) {
//            this.engine = engine;
//        }
//        public void start() {
//            this.engine.start();
//        }
//    }
//    public class PetrolEngine {
//        public void start() {
//        }
//    }

    /**
    * Принцип DIP гласит, что модули верхнего уровня не должны зависеть от модулей нижнего уровня.
    * Оба должны зависеть от абстракций. В нашем случае, класс Car напрямую зависит от класса PetrolEngine ниже по иерархии.
     */

    /**
    * Можно ввести интерфейс iEngine и добавить в него метод запуска двигателя.
    */
    public interface iEngine {
        public void start();
    }

    /**
     * Создаем класс автомобиль и имплементируем в него интерфейс iEngine
     */
    public class Car implements iEngine {

        /**
         * Создаем объект интерфейса - условный двигатель
         */
        private iEngine engine;

        /**
         * Конструктор автомобиля
         * @param engine
         */
        public Car(iEngine engine) {
            this.engine = engine;
        }

        /**
         * Метода запуска авто в зависимости от типа его двигателя
         */
        @Override
        public void start() {
            this.engine.start();
        }
    }

    public class PetrolEngine implements iEngine {

        @Override
        public void start() {
            // Логика запуска бензинового двигателя
        }
    }

    public class DieselEngine implements iEngine {

        @Override
        public void start() {
            // Логика запуска дизельного двигателя
        }
    }
}
