
package ru.netology.radio;

public class Radio {

    private byte stationsAmount = 20;
    private byte currentStation;
    private byte minVolume = 0;
    private byte maxVolume = 100;
    private byte currentVolume = minVolume;


    public Radio(byte stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public Radio() {
        System.out.println(stationsAmount);
    }

    public byte next() {
        int plus = currentStation += 1;
        if (currentStation == 20) {
            currentStation = 0;
        }
        setCurrentStation((byte) plus);
        return currentStation;
    }

    public byte prev() {
        int minus = currentStation -= 1;
        if (currentStation == -1) {
            currentStation = 19;
        }
        setCurrentStation((byte) minus);
        return currentStation;
    }

    public byte increaseVolume() {
        if (currentVolume < maxVolume) {
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

    public int getStationsAmount() {
        return stationsAmount;
    }

    public byte getCurrentStation() {
        return currentStation;
    }

    public byte getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(byte newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationsAmount - 1) {
            return;
        }
        currentStation = newCurrentStation;

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
}


