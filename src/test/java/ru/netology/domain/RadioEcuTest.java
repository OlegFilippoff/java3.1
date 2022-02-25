package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioEcuTest {


    @Test
    void shouldInitMax() {
        RadioEcu radio2 = new RadioEcu(7);
        assertEquals(6, radio2.getMaxRadioStationNumber());
    }

    @Test
    void shouldInitMaxNoArgs() {
        RadioEcu radioEcu = new RadioEcu();
        assertEquals(9, radioEcu.getMaxRadioStationNumber());
    }


    @Test
    void getCurrentRadioStationLessLowLimitTest() {
        RadioEcu radioEcu = new RadioEcu();
        radioEcu.setCurrentRadioStation(-1);
        int expected = radioEcu.getMaxRadioStationNumber();
        int actual = radioEcu.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
        void getCurrentRadioStationLessLowLimitMaxArgConstTest () {
            RadioEcu radio2 = new RadioEcu(20);
            radio2.setCurrentRadioStation(-1);
            int expected = radio2.getMaxRadioStationNumber();
            int actual = radio2.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

        @Test
        void getCurrentRadioStationLowLimitTest () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(0);
            int expected = 0;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }
        @Test
        void getCurrentRadioStationUpperLimitTest () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(9);
            int expected = radioEcu.getMaxRadioStationNumber();
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

    @Test
    void getCurrentRadioStationUpperLimitArgsConstTest () {
        RadioEcu radio2 = new RadioEcu(21);
        radio2.setCurrentRadioStation(20);
        radio2.setNextRadioStation();
        int expected = 0;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
        void getCurrentRadioStationMoreUpperLimitTest () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(10);
            int expected = 0;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

    @Test
    void getCurrentRadioStationMoreUpperLimitArgsConstTest () {
        RadioEcu radio2 = new RadioEcu(20);
        radio2.setCurrentRadioStation(20);
        radio2.setNextRadioStation();
        int expected = 1;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
        void setCurrentRadioStationLowLimitPlusOne () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(1);
            int expected = 1;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

        @Test
        void setPreviousCurrentRadioStation () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(5);
            radioEcu.setPreviousCurrentRadioStation();
            int expected = 4;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

        @Test
        void setPreviousCurrentRadioStationLowerLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(0);
            radioEcu.setPreviousCurrentRadioStation();
            int expected = radioEcu.getMaxRadioStationNumber();
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

    @Test
    void setPreviousCurrentRadioStationLowerThenLimitArgsConstTest () {
        RadioEcu radio2 = new RadioEcu(34);
        radio2.setCurrentRadioStation(0);
        radio2.setPreviousCurrentRadioStation();
        int expected = radio2.getMaxRadioStationNumber();
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
        void setNextRadioStation () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(5);
            radioEcu.setNextRadioStation();
            int expected = 6;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }
        @Test
        void setNextRadioStationUpperLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentRadioStation(9);
            radioEcu.setNextRadioStation();
            int expected = 0;
            int actual = radioEcu.getCurrentRadioStation();
            assertEquals(expected, actual);
        }

    @Test
    void setNextRadioStationUpperLimitArgsConstTest () {
        RadioEcu radio2 = new RadioEcu(64);
        radio2.setCurrentRadioStation(63);
        radio2.setNextRadioStation();
        int expected = 0;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
        void setCurrentVolume () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(5);
            int expected = 5;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setCurrentVolumeUpperLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(100);
            int expected = 100;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setCurrentVolumeLowLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(0);
            int expected = 0;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setVolumeDownLessLower () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(0);
            radioEcu.setVolumeDown();
            int expected = 0;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setVolumeDownLowLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(1);
            radioEcu.setVolumeDown();
            int expected = 0;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setVolumeUp () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(5);
            radioEcu.setVolumeUp();
            int expected = 6;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setVolumeUpUpperLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(99);
            radioEcu.setVolumeUp();
            int expected = 100;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        void setVolumeUpMoreLimit () {
            RadioEcu radioEcu = new RadioEcu();
            radioEcu.setCurrentVolume(101);
            radioEcu.setVolumeUp();
            int expected = 1;
            int actual = radioEcu.getCurrentVolume();
            assertEquals(expected, actual);
        }
    }