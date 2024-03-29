package ComplexCalculatorApp.View;

import ComplexCalculatorApp.Controllers.iComplexCalc;
import ComplexCalculatorApp.Model.Domain.ComplexNumber;

import java.util.Scanner;

public class ViewComplexCalc {
    private iComplexCalc complexCalc;

    /**
     * Конструктор
     * @param complexCalc необходимый для работы объект типа IComplexCalculable
     */
    public ViewComplexCalc(iComplexCalc complexCalc) {
        this.complexCalc = complexCalc;
    }

    /**
     * Ввод данных от пользователя
     * @param message String сообщение для пользователя при вводе
     * @return String данные от пользователя
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Ввести число с клавиатуры
     * @param message String сообщение для пользователя при вводе
     * @return double введенное пользователем число
     */
    private double inputNum(String message) {
        while (true) {
            try {
                return Double.parseDouble(prompt(message));
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number, please try again!");
            }
        }
    }

    /**
     * Ввести комплексное число с клавиатуры в два этапа
     * @return ComplexNumber
     */
    private ComplexNumber inputComplexNum() {
        double realNum = inputNum("Input the real part of the complex number: ");
        double imagNum = inputNum("Input the imaginary part of the complex number: ");
        return new ComplexNumber(realNum, imagNum);
    }

    /**
     * Функция запуска и взаимодействия с калькулятором
     */
    public void operateCalc() {

        ComplexNumber result = complexCalc.result();
        System.out.println("Starting with result: " + result);

        boolean continueCalc = true;
        while (continueCalc) {
            String operation = prompt("Input one symbol [+ , * , / , =, q]: ");
            switch (operation) {
                case "+":
                    result = complexCalc.sum(result, inputComplexNum());
                    break;
                case "*":
                    result = complexCalc.mult(result, inputComplexNum());
                    break;
                case "/":
                    result = complexCalc.div(result, inputComplexNum());
                    break;
                case "=":
                    result = complexCalc.result();
                    break;
                case "q":
                    System.out.println("Exiting the calculator!");
                    continueCalc = false;
                    break;
                default:
                    System.out.println("Unknown operation!");
                    break;
            }
        }
    }
}
