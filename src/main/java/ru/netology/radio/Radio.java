package ru.netology.radio;

public class Radio {
    public int currentWave;

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave <= 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }


    public void pushNextButton(int newWave) {
        if (newWave >= 9) {
            return;
        }
        if (newWave <= 0) {
            return;
        } else {
            currentWave = newWave + 1;
        }

    }

    public int pushPreviousButton(int newWave) {
        if (newWave <= 0) {
            newWave = 9;
            currentWave = newWave;
            return currentWave;
        }
        if (newWave > 9) {
            newWave = 0;
            return newWave;
        } else {
            currentWave = newWave - 1;
        }

        return newWave;
    }

    //    VOLUME
    public int currentVolume;

    public void setVolumeRange(int newVolumeRange) {
        if (newVolumeRange <= 0) {
            return;
        }
        if (newVolumeRange > 100) {
            return;
        }
        currentVolume = newVolumeRange;
    }

    public int increaseVolume(int newVolumeRange) {
        if (newVolumeRange <= 0) {
            newVolumeRange = 0;
            currentVolume = newVolumeRange;
            return currentVolume;

        }

        if (newVolumeRange >= 100) {
            newVolumeRange = 100;
            currentVolume = newVolumeRange;
            return currentVolume;
        }

        else {
            newVolumeRange = newVolumeRange + 1;
        }
        currentVolume = newVolumeRange;
        return newVolumeRange;
    }

    public void decreaseVolume(int newVolumeRange) {
        if (newVolumeRange <= 0) {
            return;
        }

        if (newVolumeRange > 100) {
            return;
        } else {
            newVolumeRange = newVolumeRange - 1;
        }
        currentVolume = newVolumeRange;
    }
}




