package ru.netology.radio;

public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationCount, int volumeCount) {
        this.maxStation = stationCount - 1;
        this.maxVolume = volumeCount - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave <= 0) {
            return;
        }
        if (newCurrentWave > maxStation) {
            return;
        }
        currentWave = newCurrentWave;
    }


    public void pushNextButton() {
        if (currentWave != maxStation) {
            currentWave++;
        } else {
            currentWave = 0;
        }


    }

    public void pushPreviousButton() {
        if (currentWave == 0) {
            currentWave = maxStation;
            return;
        } else {
            currentWave--;
        }


    }
    //    VOLUME

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
            return;

        } else {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;

        } else {
            currentVolume--;
        }

    }
}


// ДИЧЬ
//    public void decreaseVolume(int newVolumeRange) {
//        if (newVolumeRange <= 0) {
//            return;
//        }
//
//        if (newVolumeRange > 100) {
//            return;
//        } else {
//            newVolumeRange = newVolumeRange - 1;
//        }
//        currentVolume = newVolumeRange;
//    }
//}




