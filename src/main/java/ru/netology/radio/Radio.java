package ru.netology.radio;

public class Radio {

    private byte stationsAmount = 10;
    private byte currentStation;

    public Radio() {
        System.out.println(stationsAmount);
    }

    public Radio(byte Amount) {

    }

    private byte minVolume = 0;
    private byte maxVolume = 100;
    private byte currentVolume = minVolume;

    public Radio(byte minVolume, byte maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public byte getStationsAmount() {
        return stationsAmount;
    }

    public byte getCurrentStation() {
        return currentStation;
    }

    public byte getCurrentVolume() {
        return currentVolume;
    }

    public byte getMinVolume() {
        return minVolume;
    }

    public byte getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(byte newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public byte next() {
        if (currentStation <= 9) {
            currentStation = (byte) (currentStation + 1);
        }
        if (currentStation == 10) {
            currentStation = 0;
        }
        return currentStation;
    }

    public byte prev() {
        if (currentStation >= 0) {
            currentStation = (byte) (currentStation - 1);
        }
        if (currentStation == -1) {
            currentStation = 9;
        }
        return currentStation;
    }

    public void setCurrentVolume(byte newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public byte increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = (byte) (currentVolume + 1);
        }
        return currentVolume;
    }

    public byte reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = (byte) (currentVolume - 1);
        }
        return currentVolume;
    }
}


