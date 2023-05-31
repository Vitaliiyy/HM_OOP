package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setWaveNumber() {
        Radio wave = new Radio();

        wave.currentWave = 6;
        int expected = 6;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWave() {
        Radio wave = new Radio();

        wave.setCurrentWave(9);

        int expected = 9;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWave1() {
        Radio wave = new Radio();

        wave.setCurrentWave(10);

        int expected = 0;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWave2() {
        Radio wave = new Radio();

        wave.setCurrentWave(-2);

        int expected = 0;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton() {
        Radio wave = new Radio();

        wave.pushNextButton(9);

        int expected = 0;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton1() {
        Radio wave = new Radio();

        wave.pushNextButton(-5);

        int expected = 0;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushNextButton2() {
        Radio wave = new Radio();

        wave.pushNextButton(8);

        int expected = 9;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushPreviousButton() {
        Radio wave = new Radio();

        wave.pushPreviousButton(0);

        int expected = 9;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushPreviousButton1() {
        Radio wave = new Radio();

        wave.pushPreviousButton(10);

        int expected = 0;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pushPreviousButton2() {
        Radio wave = new Radio();

        wave.pushPreviousButton(8);

        int expected = 7;
        int actual = wave.currentWave;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void setVolumeRange() {
        Radio wave = new Radio();

        wave.setVolumeRange(80);

        int expected = 80;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeRange1() {
        Radio wave = new Radio();

        wave.setVolumeRange(-8);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeRange2() {
        Radio wave = new Radio();

        wave.setVolumeRange(120);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio wave = new Radio();

        wave.increaseVolume(100);

        int expected = 100;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio wave = new Radio();

        wave.increaseVolume(-5);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio wave = new Radio();

        wave.increaseVolume(120);

        int expected = 100;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume4() {
        Radio wave = new Radio();

        wave.increaseVolume(98);

        int expected = 99;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio wave = new Radio();

        wave.decreaseVolume(1);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio wave = new Radio();

        wave.decreaseVolume(120);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        Radio wave = new Radio();

        wave.decreaseVolume(-11);

        int expected = 0;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
