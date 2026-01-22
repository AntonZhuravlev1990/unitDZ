package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnIfTheAmountDoesNotReachTheThreshold() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int result = service.remain(amount);

        Assert.assertEquals(result, 100);
    }

    @Test
    public void shouldReturnIfTheAmountIsAboveThethreshold() {
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

        Assert.assertEquals(amount, expected);
    }


}