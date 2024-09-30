package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote blackRemote = new TVRemote("Negro");

        blackRemote.turnOn();

        blackRemote.channelUp();

        blackRemote.channelDown();

        blackRemote.channelDown();

        blackRemote.volumeUp();

        blackRemote.volumeDown();

        blackRemote.volumeDown();

        System.out.println(blackRemote.getColor());

        blackRemote.turnOff();
    }

}