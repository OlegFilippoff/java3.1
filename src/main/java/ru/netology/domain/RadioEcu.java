package ru.netology.domain;

public class RadioEcu {

    private int maxRadioStations = 10;
    private int currentVolume;
    private int currentRadioStation;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStations - 1;
    }


    public RadioEcu() {
    }

    public RadioEcu(int maxRadioStations) {
        this.maxRadioStations = maxRadioStations;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = maxRadioStations - 1;
        }
        if (currentRadioStation > maxRadioStations - 1) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setPreviousCurrentRadioStation() {
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public void setNextRadioStation() {
        setCurrentRadioStation(currentRadioStation + 1);
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeDown() {
        setCurrentVolume(currentVolume - 1);

    }

    public void setVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }
}
