package ru.netology.radio;

public class Radio {
    private int currentWave;
    private int currentVolume;

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
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }


    public void pushNextButton() {
        if (currentWave != 9) {
            currentWave++;
        } else {
            currentWave = 0;
        }


    }

    public void pushPreviousButton() {
        if (currentWave == 0) {
            currentWave = 9;
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




