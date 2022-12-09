
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {

        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // return Math.sqrt(number);
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        return 0; // Метод должен возвращать сумму покупки со скидкой
    }
}