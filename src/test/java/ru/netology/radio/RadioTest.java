package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setCurrentWaveConstructor() {
        Radio wave = new Radio(20);

        wave.setCurrentWave(17);

        int expected = 17;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWaveConstructor1() {
        Radio wave = new Radio(0);

        wave.setCurrentWave(0);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWaveConstructor2() {
        Radio wave = new Radio(10);

        wave.setCurrentWave(0);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWaveConstructor3() {
        Radio wave = new Radio(10);

        wave.setCurrentWave(-2);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWaveConstructor4() {
        Radio wave = new Radio(9);

        wave.setCurrentWave(9);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentWave() {
        Radio wave = new Radio();

        wave.setCurrentWave(9);

        int expected = 9;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWave1() {
        Radio wave = new Radio();

        wave.setCurrentWave(10);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWave2() {
        Radio wave = new Radio();

        wave.setCurrentWave(-2);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton() {
        Radio wave = new Radio();

        wave.setCurrentWave(9);
        wave.pushNextButton();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton1() {
        Radio wave = new Radio();

        wave.setCurrentWave(0);
        wave.pushNextButton();

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton2() {
        Radio wave = new Radio();

        wave.setCurrentWave(5);
        wave.pushNextButton();

        int expected = 6;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void pushPreviousButton() {
        Radio wave = new Radio();

        wave.setCurrentWave(9);
        wave.pushPreviousButton();

        int expected = 8;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushPreviousButton1() {
        Radio wave = new Radio();

        wave.setCurrentWave(0);
        wave.pushPreviousButton();

        int expected = 9;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushPreviousButton2() {
        Radio wave = new Radio();

        wave.setCurrentWave(1);
        wave.pushPreviousButton();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(101);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume1() {
        Radio wave = new Radio();

        wave.setCurrentVolume(0);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio wave = new Radio();

        wave.setCurrentVolume(-5);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(1);

        wave.increaseVolume();

        int expected = 2;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio wave = new Radio();

        wave.setCurrentVolume(0);

        wave.increaseVolume();

        int expected = 1;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio wave = new Radio();

        wave.setCurrentVolume(100);

        wave.increaseVolume();

        int expected = 100;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume3() {
        Radio wave = new Radio();

        wave.setCurrentVolume(99);

        wave.increaseVolume();

        int expected = 100;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(0);

        wave.decreaseVolume();

        int expected = 0;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio wave = new Radio();

        wave.setCurrentVolume(1);

        wave.decreaseVolume();

        int expected = 0;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume3() {
        Radio wave = new Radio();

        wave.setCurrentVolume(100);

        wave.decreaseVolume();

        int expected = 99;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}




