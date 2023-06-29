package ru.netology.radio;

public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount -1;


    }




    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume > 100) {
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
        if (currentVolume == 100) {
            currentVolume = 100;
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




