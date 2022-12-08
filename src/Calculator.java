
public class Calculator {
    public static void main(String[] args) {
        System.out.println(squareRootExtraction(0));
    }
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
    public static double squareRootExtraction(double number){

        // Граничные случаи:
        //  0
        //  Отрицательные числа


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

}

