package entities;

import enums.TypeElement;
import interfaces.Brightness;
import interfaces.Show;

public class Image extends MultimedialElement implements Show, Brightness {

    public Image(String title, int brightness, TypeElement typeElement) {
        super(title, brightness,typeElement);
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
