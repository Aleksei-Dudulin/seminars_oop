package ComplexCalculatorApp;

import ComplexCalculatorApp.Controllers.iComplexCalc;
import ComplexCalculatorApp.Model.ComplexCalc;
import ComplexCalculatorApp.Model.Domain.ComplexNumber;

public class Decorator implements iComplexCalc {

    private ComplexCalc complexCalc;
    private Logger logger;

    /**
     * Конструктор класса декоратор
     *
     * @param complexCalc класс для вычислений
     * @param logger      класс для логирования
     */
    public Decorator(ComplexCalc complexCalc, Logger logger) {
        this.complexCalc = complexCalc;
        this.logger = logger;
    }

    /**
     * Определяем метод, который будет вызываться в каждом методе, записывать в лог данные и выводить результаты.
     *
     * @param operation
     * @param x
     * @param y
     * @param result
     */
    private void logAndPrintOperation(String operation, ComplexNumber x, ComplexNumber y, ComplexNumber result) {
        String message = operation + " " + x + " " + operation + " " + y + " = " + result + "\n";
        System.out.print(message);
        logger.log(message);
    }

    /**
     * Переопределение метода суммирования комплексных чисел с логгированием
     *
     * @param x первое число
     * @param y второе число
     * @return результат
     */
    @Override
    public ComplexNumber sum(ComplexNumber x, ComplexNumber y) {
        logAndPrintOperation("Сложение", x, y, complexCalc.sum(x, y));
        return complexCalc.sum(x, y);
    }

    /**
     * Переопределение метода умножения комплексных чисел с логгированием
     *
     * @param x первое число
     * @param y второе число
     * @return результат
     */
    @Override
    public ComplexNumber mult(ComplexNumber x, ComplexNumber y) {
        logAndPrintOperation("Умножение", x, y, complexCalc.mult(x, y));
        return complexCalc.mult(x, y);
    }

    /**
     * Переопределение метода деления комплексных чисел с логгированием
     *
     * @param x первое число
     * @param y второе число
     * @return результат
     */
    @Override
    public ComplexNumber div(ComplexNumber x, ComplexNumber y) {
        logAndPrintOperation("Деление", x, y, complexCalc.mult(x, y));
        return complexCalc.mult(x, y);
    }

    /**
     * Переопределяем метод возврата результата последней операции калькулятора с логгированием
     *
     * @return результат
     */
    @Override
    public ComplexNumber result() {
        String s = "Результат " + complexCalc.result() + "\n";
        System.out.print(s);
        logger.log(s);
        return complexCalc.result();
    }
}
