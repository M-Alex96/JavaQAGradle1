package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfHigherThan1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfEquals1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
