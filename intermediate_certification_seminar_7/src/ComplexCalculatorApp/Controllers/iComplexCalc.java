package ComplexCalculatorApp.Controllers;

import ComplexCalculatorApp.Model.Domain.ComplexNumber;

public interface iComplexCalc {

    /**
     * Сумма комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return ComplexNumber результат
     */
    ComplexNumber sum(ComplexNumber x, ComplexNumber y);

    /**
     * Произведение двух комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber mult(ComplexNumber x, ComplexNumber y);

    /**
     * Деление двух комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber div(ComplexNumber x, ComplexNumber y);

    /**
     * Текущий результат калькулятора
     *
     * @return значение
     */
    ComplexNumber result();

}
