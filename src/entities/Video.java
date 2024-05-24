package entities;

import enums.TypeElement;
import interfaces.Brightness;
import interfaces.Play;

import java.util.Timer;

public class Video extends MultimedialElement implements Play, Brightness {


    public Video(String title, int length, int volume, int brightness, TypeElement typeElement) {
        super(title, length, volume, brightness, typeElement );
    }


    @Override
    public void play() {

    }

    @Override
    public void aumentaLuminosita(int value) {

    }

    @Override
    public void diminuisciLuminosita(int value) {

    }

    @Override
    public void abbassaVolume(int value) {

    }

    @Override
    public void alzaVolume(int value) {

    }
}
