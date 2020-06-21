package com.cryfish.myalomatika.model;

import javax.sound.sampled.AudioInputStream;

public class MentalNumber {
    private String number;
    private AudioInputStream voice;
    private String color;

    public MentalNumber(String number, AudioInputStream voice, String color) {
        this.number = number;
        this.voice = voice;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AudioInputStream getVoice() {
        return voice;
    }

    public void setVoice(AudioInputStream voice) {
        this.voice = voice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return number;
    }
}
