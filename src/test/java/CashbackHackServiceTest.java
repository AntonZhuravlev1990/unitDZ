import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainderIfTheAmountIsLessThenTheSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int result = service.remain(amount);

        Assert.assertEquals(result, 100);
    }

    @Test
    public void shouldReturnIfTheAmountIsAboveTheMaximum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int result = service.remain(amount);

        Assert.assertEquals(result, 700);
    }

    @Test
    public void shouldReturnIfTheAmountIsMinimal() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int result = service.remain(amount);

        Assert.assertEquals(result, 999);
    }

    @Test
    public void shouldReturnZeroWhenTheSumIsAMultipleOfTheBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int result = service.remain(amount);

        Assert.assertEquals(result, expected);
    }
}





}
