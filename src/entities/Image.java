package entities;

import interfaces.Brightness;
import interfaces.Show;

public class Image extends MultimedialElement implements Show, Brightness {

    public Image(String title, int brightness) {
        super(title, brightness);
    }

    @Override
    public void aumentaLuminosita(int value) {

    }

    @Override
    public void diminuisciLuminosita(int value) {

    }

    @Override
    public void show() {

    }
}
