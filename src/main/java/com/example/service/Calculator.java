package service;

public class Calculator {

    // Қосу
    public int add(int a, int b) {
        return a + b;
    }

    // Азайту
    public int subtract(int a, int b) {
        return a - b;
    }

    // Көбейту
    public int multiply(int a, int b) {
        return a * b;
    }

    // Бөлу
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Нөлге бөлуге болмайды!");
        }
        return (double) a / b;
    }
}
