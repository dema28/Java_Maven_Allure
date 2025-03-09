

import Novicov.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Calculator Operations")
@Feature("Basic Arithmetic Operations")
@Tag("smoke")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test Addition")
    @Description("This test verifies the addition of two numbers.")
    @Story("Add two numbers")
    @Severity(SeverityLevel.CRITICAL)
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Test Subtraction")
    @Description("This test verifies the subtraction of two numbers.")
    @Story("Subtract two numbers")
    @Severity(SeverityLevel.NORMAL)
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
