import java.util.Date;

public class Task_1 {
    /**
     * Переписать код в соответствии с Single Responsibility Principle
     */
//    public class Employee {
//        private String name;
//        private Date dob;
//        private int baseSalary;
//        public Employee(String name, Date dob, int baseSalary) {
//            this.name = name;
//            this.dob = dob;
//            this.baseSalary = baseSalary;
//        }
//        public String getEmpInfo() {
//            return "name - " + name + " , dob - " + dob.toString();
//        }
//        public int calculateNetSalary() {
//            int tax = (int) (baseSalary * 0.25);//calculate in otherway
//            return baseSalary - tax;
//        }
//    }

    /**
     * Выносим метод расчета зарплаты в отдельный класс SalaryCalculation. Это позволяет нам сделать класс Employee
     * ответственным за единственную функциональность - хранение информации о сотруднике, тогда как метод вычисления
     * базовой зарплаты мы вынесем в отдельный класс Account.
     */
    public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;

        /**
         * Конструктор объектов класса Employee
         * @param name
         * @param dob
         * @param baseSalary
         */
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }

        /**
         * Метод получения информации об объекте класса Employee
         * @return
         */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

    }

    public class Account {
        public int calculateNetSalary(int baseSalary) {
            int tax = (int) (baseSalary * 0.25); //calculate in otherway
            return baseSalary - tax;
        }
    }
}
