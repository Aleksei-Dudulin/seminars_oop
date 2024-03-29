package ComplexCalculatorApp;

import ComplexCalculatorApp.Controllers.iComplexCalc;
import ComplexCalculatorApp.Model.ComplexCalc;
import ComplexCalculatorApp.View.ViewComplexCalc;

public class App {
    public static void main(String[] args) {
        // Создаем экземпляр класса калькулятора комплексных чисел
        ComplexCalc complexCalc = new ComplexCalc();
        // Создаем экземпляр класса логгер для записи в файл
        Logger logger = new Logger("D:/Программирование/2. Специализация/Язык Java/seminars_oop/intermediate_certification_seminar_7/src/ComplexCalculatorApp/logFileApp.txt");
        // Создаем экземпляр класса декоратор, осуществляющего вычисление и логирование
        iComplexCalc decorator = new Decorator(complexCalc, logger);
        // Создаем экземпляр класса ViewComplexCalc, осуществляющего взаимодействие с пользователем и классами калькулятора комплексных чисел и логгером
        ViewComplexCalc calculatorView = new ViewComplexCalc(decorator);
        // Запускаем на исполнение экземпляр класса ViewComplexCalc
        calculatorView.operateCalc();
    }
}
