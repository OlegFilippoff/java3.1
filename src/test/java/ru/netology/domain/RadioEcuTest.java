package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioEcuTest {


    @Test
    void setCurrentVolumeNoArgsTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setVolumeUp();
        assertEquals(1,radioEcu.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeAllArgsTest() {
        RadioEcu radioEcu2 = new RadioEcu(55,99,5);
        radioEcu2.setVolumeUp();
        assertEquals(100,radioEcu2.getCurrentVolume());
    }

    @Test
    void setPreviousCurrentRadioStationNoArgsTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setPreviousCurrentRadioStation();
        assertEquals(9, radioEcu.getCurrentRadioStation());
    }

    @Test
    void setPreviousCurrentRadioStationAllArgsTest() {
        RadioEcu radioEcu2 = new RadioEcu(19,90,0);
        radioEcu2.setPreviousCurrentRadioStation();
        assertEquals(radioEcu2.getMaxRadioStations(), radioEcu2.getCurrentRadioStation());
    }

    @Test
    void setNextRadioStationNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setNextRadioStation();
        assertEquals(1,radioEcu.getCurrentRadioStation());
    }
    @Test
    void setNextRadioStationAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(12,0,11);
        radioEcu2.setNextRadioStation();
        assertEquals(0,radioEcu2.getCurrentRadioStation());
    }

    @Test
    void testCurrentVolume() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(0, radioEcu.getCurrentVolume());
    }

    @Test
    void setVolumeDownNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setVolumeDown();
        assertEquals(0, radioEcu.getCurrentVolume());
    }

    @Test
    void setVolumeDownAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(10,1,9);
        radioEcu2.setVolumeDown();
        assertEquals(0, radioEcu2.getCurrentVolume());
    }

    @Test
    void setVolumeUpNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setVolumeUp();
        assertEquals(1, radioEcu.getCurrentVolume());
    }

    @Test
    void setVolumeUpAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(10,100,5);
        radioEcu2.setVolumeUp();
        assertEquals(100, radioEcu2.getCurrentVolume());
    }

    @Test
    void getMaxRadioStationsNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(9, radioEcu.getMaxRadioStations());

    }

    @Test
    void getMaxRadioStationsAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(55,0,0);
        assertEquals(54, radioEcu2.getMaxRadioStations());

    }

    @Test
    void getCurrentVolumeNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(0, radioEcu.getCurrentVolume());
    }
    @Test
    void getCurrentVolumeAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(0,99,1);
        assertEquals(99, radioEcu2.getCurrentVolume());
    }

    @Test
    void getCurrentRadioStationNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(0, radioEcu.getCurrentRadioStation());

    }
    @Test
    void getCurrentRadioStationAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(10,9,9);
        assertEquals(9, radioEcu2.getCurrentRadioStation());

    }

    @Test
    void setMaxRadioStationsNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(9, radioEcu.getMaxRadioStations());
    }
    @Test
    void setMaxRadioStationsAllArgs() {
        RadioEcu radioEcu2 = new RadioEcu(20,0,0);
        assertEquals(19, radioEcu2.getMaxRadioStations());
    }
}