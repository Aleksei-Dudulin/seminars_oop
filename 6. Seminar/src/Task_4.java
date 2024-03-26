public class Task_4 {
    /**
     * Переписать код в соответствии с Liskov Substitution Principle:
     */
//    public class Rectangle {
//        private int width;
//        private int height;
//        public void setWidth(int width) {
//            this.width = width;
//        }
//        public void setHeight(int height) {
//            this.height = height;
//        }
//        public int area() {
//            return this.width * this.height;
//        }
//    }
//    public class Square extends Rectangle {
//        @Override
//        public void setWidth(int width) {
//            super.width = width;
//            super.height = width;
//        }
//        @Override
//        public void setHeight(int height) {
//            super.width = height;
//            super.height = height;
//        }
//    }
    /**
     * Принцип LSP говорит нам о том, что объекты должны быть заменяемыми на экземпляры их подтипов
     * без изменения желаемых свойств программы. В данном примере класс Square изменяет поведение
     * методов setWidth и setHeight, которые были унаследованы от класса Rectangle. Можно ввести интерфейс,
     * определяющий общее поведение для всех фигур.
     */

    /**
     * Создаем интерфейс, который будет содержать в себе метод инициализации размеров фигур и вычисления их площади.
     */
    public interface iFigure {
        void setWidth(int width);
        void setHeight(int height);
        int area();
    }

    /**
     * Теперь любой класс может имплементировать этот интерфейс и переопределять входящие в него методы по своему
     */
    public class Rectangle implements iFigure {
        private int width;
        private int height;

        @Override
        public void setWidth(int width) {
            this.width = width;
        }

        @Override
        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int area() {
            return this.height * this.width;
        }
    }

    public class Square implements iFigure {
        private int side;

        @Override
        public void setWidth(int width) {
            this.side = width;
        }

        @Override
        public void setHeight(int height) {
            this.side = height;
        }

        @Override
        public int area() {
            return this.side * this.side;
        }
    }
}
