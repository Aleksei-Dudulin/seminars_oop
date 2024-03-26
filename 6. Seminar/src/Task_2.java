////public class Task_2 {
//    /**
//     * Переписать код SpeedCalculation в соответствии с Open-Closed Principle
//     */
//    public class SpeedCalculation {
//        public double calculateAllowedSpeed(Vehicle vehicle) {
//            if (vehicle.getType().equalsIgnoreCase("Car")) {
//                return vehicle.getMaxSpeed() * 0.8;
//            } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//                return vehicle.getMaxSpeed() * 0.6;
//            }
//            return 0.0;
//        }
//    }
//    public class Vehicle {
//        int maxSpeed;
//        String type;
//        public Vehicle(int maxSpeed, String type) {
//            this.maxSpeed = maxSpeed;
//            this.type = type;
//        }
//        public int getMaxSpeed() {
//            return this.maxSpeed;
//        }
//        public String getType() {
//            return this.type;
//        }
//    }

/**
 * Принцип OCP говорит нам о том, что программные сущности рекомендуется делать открытыми для расширения и
 * закрытыми для изменения. В нашем случае класс SpeedCalculation имеет метод, который нам придется изменять в случае,
 * если потребуется добавить новый тип класса Vehicle.
 */

public class Task_2 {

    /** Статическое поле car, представляющее объект типа Car. */
    static MyVehicle car = new Car(120, "Car", 0.8);

    /** Статическое поле bus, представляющее объект типа Bus. */
    static MyVehicle bus = new Bus(80, "Bus", 0.6);

    /**
     * Основной метод программы, запускающий тестирование.
     */
    public static void main(String[] args) {
        // Получение разрешенной скорости для автомобиля и автобуса
        double carAllowedSpeed = car.getAllowedSpeed();
        double busAllowedSpeed = bus.getAllowedSpeed();

        // Вывод разрешенной скорости для автомобиля и автобуса
        System.out.println("Car allowed speed: " + carAllowedSpeed);
        System.out.println("Bus allowed speed: " + busAllowedSpeed);
    }

    /** Интерфейс iCalculateAllowedSpeed определяет методы для вычисления максимальной и разрешенной скоростей. */
    interface iCalculateAllowedSpeed {
        /**
         * Метод для получения разрешенной скорости.
         * @return разрешенная скорость
         */
        double getAllowedSpeed();

        /**
         * Метод для получения максимальной скорости.
         * @return максимальная скорость
         */
        double getMaxSpeed();

        /**
         * Метод для получения типа транспортного средства.
         * @return тип транспортного средства
         */
        String getType();
    }

    /** Класс MyVehicle представляет транспортное средство. */
    static class MyVehicle implements iCalculateAllowedSpeed {
        /** Максимальная скорость транспортного средства. */
        double maxSpeed;

        /** Тип транспортного средства. */
        String type;

        /** Коэффициент для вычисления разрешенной скорости. */
        double k;

        /**
         * Конструктор для создания объекта MyVehicle.
         * @param maxSpeed максимальная скорость
         * @param type тип транспортного средства
         * @param k коэффициент для вычисления разрешенной скорости
         */
        public MyVehicle(double maxSpeed, String type, double k) {
            this.maxSpeed = maxSpeed;
            this.type = type;
            this.k = k;
        }

        /** Переопределение метода интерфейса для получения максимальной скорости. */
        public double getMaxSpeed() {
            return maxSpeed;
        }

        /** Переопределение метода интерфейса для получения типа транспортного средства. */
        public String getType() {
            return type;
        }

        /** Переопределение метода интерфейса для вычисления разрешенной скорости. */
        public double getAllowedSpeed() {
            return maxSpeed * k;
        }
    }

    /** Класс Car представляет автомобиль и наследуется от родительского класса MyVehicle. */
    static class Car extends MyVehicle {
        /**
         * Конструктор для создания объекта Car.
         */
        public Car(double maxSpeed, String type, double k) {
            super(maxSpeed, type, k);
        }
    }

    /** Класс Bus представляет автобус и наследуется от родительского класса MyVehicle. */
    static class Bus extends MyVehicle {
        /**
         * Конструктор для создания объекта Bus.
         * @param maxSpeed максимальная скорость автобуса
         * @param type тип автобуса
         * @param k коэффициент для вычисления разрешенной скорости
         */
        public Bus(double maxSpeed, String type, double k) {
            super(maxSpeed, type, k);
        }
    }
}
