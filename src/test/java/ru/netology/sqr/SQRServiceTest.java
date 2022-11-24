package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTest() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest1() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest2() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 9900);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest3() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 100_100);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}
