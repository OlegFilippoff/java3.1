package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioEcuTest {



    @Test
    void getCurrentRadioStationLessLowLimitTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationLowLimitTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void getCurrentRadioStationUpperLimitTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationMoreUpperLimitTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationLowLimitPlusOne() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStation() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(5);
        radioEcu.setPreviousCurrentRadioStation();
        int expected = 4;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStationLowerLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(0);
        radioEcu.setPreviousCurrentRadioStation();
        int expected = 9;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStation() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(5);
        radioEcu.setNextRadioStation();
        int expected = 6;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void setNextRadioStationUpperLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(9);
        radioEcu.setNextRadioStation();
        int expected = 0;
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(5);
        int expected = 5;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUpperLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(10);
        int expected = 10;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLowLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(0);
        int expected = 0;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLessLower() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(0);
        radioEcu.setVolumeDown();
        int expected = 0;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLowLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(1);
        radioEcu.setVolumeDown();
        int expected = 0;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(5);
        radioEcu.setVolumeUp();
        int expected = 6;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpUpperLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(9);
        radioEcu.setVolumeUp();
        int expected = 10;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpMoreLimit() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentVolume(10);
        radioEcu.setVolumeUp();
        int expected = 10;
        int actual = radioEcu.getCurrentVolume();
        assertEquals(expected, actual);
    }
}