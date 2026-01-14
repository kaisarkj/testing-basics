package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Позитивті сценарий: қосу
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    // Позитивті сценарий: азайту
    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    // Позитивті сценарий: көбейту
    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-2, 1));
    }

    // Позитивті сценарий: бөлу
    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(2.5, calculator.divide(5, 2));
    }

    // Негативті сценарий: нөлге бөлу
    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(5, 0)
        );
        assertEquals("Нөлге бөлуге болмайды!", exception.getMessage());
    }
}
