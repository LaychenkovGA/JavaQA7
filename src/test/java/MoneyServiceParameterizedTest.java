import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn.services.MoneyService;

public class MoneyServiceParameterizedTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/MoneyMonth.csv")

    public void testMoneyService(int expected, int income, int expenses, int threshold) {

        MoneyService service = new MoneyService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

