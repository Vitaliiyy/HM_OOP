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
    public void pushNextButton() {
        Radio wave = new Radio();

        wave.pushNextButton(9);

        int expected = 0;
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
    public void setVolumeRange() {
        Radio wave = new Radio();

        wave.setVolumeRange(80);

        int expected = 80;
        int actual = wave.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio wave = new Radio();

        wave.increaseVolume(99);

        int expected = 100;
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
}
