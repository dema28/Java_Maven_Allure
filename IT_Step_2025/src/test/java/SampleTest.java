

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest {

    @Test
    @Description("Пример теста с Allure")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Проверка логики")
    public void testExample() {
        assertTrue(true);
    }
}
