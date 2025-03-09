import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllureExampleTest {

    @Test
    @Description("Проверяем, что 2+2=4") // Описание теста
    @Severity(SeverityLevel.CRITICAL)   // Важность теста
    @Feature("Арифметика")              // Группировка по фичам
    @Story("Сложение чисел")            // Группировка по историям
    @Link(name = "Документация", url = "https://example.com")
    @Owner("Denis Novicov")             // Автор теста
    public void additionTest() {
        int result = 2 + 2;
        assertTrue(result == 4);
    }
}
