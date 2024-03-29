package ComplexCalculatorApp.Model;

import ComplexCalculatorApp.Controllers.iComplexCalc;
import ComplexCalculatorApp.Model.Domain.ComplexNumber;

public class ComplexCalc implements iComplexCalc {

    // Результат последней операции калькулятора
    private ComplexNumber result = new ComplexNumber(0, 0);

    /**
     * Переопределение метода сложения комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return результат сложения
     */
    @Override
    public ComplexNumber sum(ComplexNumber x, ComplexNumber y) {
        // (a + bi) + (c + di) = (a + c) + (b + d)i
        this.result = new ComplexNumber(x.getRealNum() + y.getRealNum(), x.getImagNum() + y.getImagNum());
        return this.result;
    }

    /**
     * Переопределение метода умножения комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return результат умножения
     */
    @Override
    public ComplexNumber mult(ComplexNumber x, ComplexNumber y) {
        // (a + bi) * (c + di) = ac + adi + bci + bdii = (ac - bd) + (ad + bc)i
        this.result = new ComplexNumber(x.getRealNum() * y.getRealNum() - x.getImagNum() * y.getImagNum(),
                x.getRealNum() * y.getImagNum() + x.getImagNum() * y.getRealNum());
        return this.result;
    }

    /**
     * Переопределение метода деления комплексных чисел
     *
     * @param x первое число
     * @param y второе число
     * @return результат умножения
     */
    @Override
    public ComplexNumber div(ComplexNumber x, ComplexNumber y) {
        // (a + bi) / (c + di) = (ac + bd) / (cc + dd) + (bc - ad)i / (cc + dd)
        if (y.getRealNum() == 0 && y.getImagNum() == 0) {
            throw new RuntimeException("Math error: Attempted to divide by Zero\n");
        } else {
            this.result = new ComplexNumber((x.getRealNum() * y.getRealNum() + x.getImagNum() * y.getImagNum()) /
                    (Math.pow(y.getRealNum(), 2) + Math.pow(y.getImagNum(), 2)),
                    (x.getImagNum() * y.getRealNum() - x.getRealNum() * y.getImagNum()) /
                            (Math.pow(y.getRealNum(), 2) + Math.pow(y.getImagNum(), 2)));
            return this.result;
        }

    }

    /**
     * Переопределяем метод result
     *
     * @return result
     */
    @Override
    public ComplexNumber result() {
        return result;
    }
}
