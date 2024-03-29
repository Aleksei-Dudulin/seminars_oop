package ComplexCalculatorApp.Model.Domain;

public class ComplexNumber {
    // Реальная часть комплексного числа
    private double realNum;
    // Мнимая часть комплексного числа
    private double imagNum;
    // Точность отображения после запятой
    private static int decimalDigit = 4;

    /**
     * Конструктор комплексного числа
     *
     * @param realNum реальная часть
     * @param imagNum мнимая часть
     */
    public ComplexNumber(double realNum, double imagNum) {
        this.realNum = realNum;
        this.imagNum = imagNum;
    }

    /**
     * Вернуть реальную часть комплексного числа
     *
     * @return double реальная часть комплексного числа
     */
    public double getRealNum() {
        return realNum;
    }

    /**
     * Вернуть мнимую часть комплексного числа
     *
     * @return double мнимая часть комплексного числа
     */
    public double getImagNum() {
        return imagNum;
    }

    /**
     * Вернуть точность отображения комплексного числа
     *
     * @return int точность отображения комплексного числа
     */
    public static int getDecimalDigit() {
        return decimalDigit;
    }

    /**
     * Установить точность отображения комплексного числа
     *
     * @param decimalDigit int точность отображения комплексного числа
     */
    public static void setDecimalDigit(int decimalDigit) {
//        ComplexNumber.decimalDigit = Math.max(0, Math.min(15, decimalDigit));
        if (decimalDigit < 0) {
            ComplexNumber.decimalDigit = 0;
        } else if (decimalDigit > 15) {
            ComplexNumber.decimalDigit = 15;
        } else {
            ComplexNumber.decimalDigit = decimalDigit;
        }
    }

    /**
     * Формируем представление комплексного числа в виде строки
     *
     * @return String представление комплексного числа
     */
    @Override
    public String toString() {

        String formatString = "%." + decimalDigit + "f";
        // Создаем строку для хранения реальной части числа
        String r = (realNum != 0) ? String.format(formatString, realNum) : "";

        // Создаем строку для хранения мнимой части числа
        String i = (imagNum == 0) ? "" : // Если мнимая часть равна нулю, оставляем строку пустой
                (imagNum == 1) ? "+i" : // Если мнимая часть равна 1, добавляем "+i"
                        (imagNum == -1) ? "-i" : // Если мнимая часть равна -1, добавляем "-i"
                                String.format(formatString, imagNum) + "i"; // В остальных случаях добавляем мнимую часть с учетом точности и знака "i"

        return String.format("%s%s", r, i);
    }
}

