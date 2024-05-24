package entities;

import interfaces.Brightness;
import interfaces.Play;

public class Video extends MultimedialElement implements Play, Brightness {


    public Video(String title, int length, int volume, int brightness) {
        super(title, length, volume, brightness);
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
