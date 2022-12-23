
package ru.netology.radio;

public class Radio {

    private byte stationsAmount = 10;
    private byte currentStation;
    private byte minVolume = 0;
    private byte maxVolume = 100;
    private byte currentVolume = minVolume;

    public Radio() {
        System.out.println(stationsAmount);
    }

    public Radio(byte Amount) {

    }

    public byte next() {
        int plus = currentStation +=1;
        if (currentStation == 10) {
            currentStation = 0;
        }
        setCurrentStation((byte) plus);
        return currentStation;
    }

    public byte prev() {
        int minus = currentStation -=1;
        if (currentStation == -1) {
            currentStation = 9;
        }
        setCurrentStation((byte) minus);
        return currentStation;
    }

    public byte increaseVolume() {
        if (currentVolume < 10) {
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

    public byte getStationsAmount() {
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
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setCurrentVolume(byte newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}



