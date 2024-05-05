import org.junit.jupiter.api.Assertions;
import org.example.java51qa86.services.VacationService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Vacation.csv")
    public void testTotalVacationMonthCount(int savings, int income, int expense) {
        VacationService service = new VacationService();
        int expectedMonthCount = 2;
        int actualMonthCount = service.calculate(savings, income, expense);
        Assertions.assertEquals(expectedMonthCount, actualMonthCount);
    }
}


