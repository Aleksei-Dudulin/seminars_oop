public class Task_3 {
    /**
     * Переписать код в соответствии с Interface Segregation Principle:
     */
//    public interface Shape {
//        double area();
//        double volume();
//    }
//    public class Circle implements Shape {
//        private double radius;
//        public Circle(double radius) {
//            this.radius = radius;
//        }
//        @Override
//        public double area() {
//            return 2 * 3.14 * radius;
//        }
//        @Override
//        public double volume() {
//            throw new UnsupportedOperationException();
//        }
//    }
//    public class Cube implements Shape {
//        private int edge;
//        public Cube(int edge) {
//            this.edge = edge;
//        }
//        @Override
//        public double area() {
//            return 6 * edge * edge;
//        }
//        @Override
//        public double volume() {
//            return edge * edge * edge;
//        }
//    }

    /**
     * Принцип ISP гласит, что архитектурные границы между классами
     */


    /**
     * Сегрегируем один интерфейс Shape на два, чтобы исключить заглушки при переопределении методов интерфейсов,
     * которые используются в одних классах и не используются в других.
     */
    public interface Shape_2D {
        double area();
    }

    public interface Shape_3D {
        double volume();
    }

    /**
     * В класс Circle имплементируем Shape_2D, чтобы вычислять площадь
     */
    public class Circle implements Shape_2D {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Переопределяем метод, наделяя его новой логикой.
         * @@area
         */
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    /**
     * В класс Cube имплементируем оба интерфейса, т.к. у куба есть как площадь всех его плоскостей, так и объем пространства между ними.
     */
    public class Cube implements Shape_2D, Shape_3D {
        private int edge;
        public Cube(int edge) {
            this.edge = edge;
        }

        /**
         * переопределяем оба метода, наделяя их какой-то новой логикой
         * @@area
         * @@volume
         */
        @Override
        public double area() {
            return 6 * edge * edge;
        }
        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}
