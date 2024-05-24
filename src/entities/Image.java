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
        if (this.brightness > 0){
            this.brightness--;
        }
    }

    @Override
    public void diminuisciLuminosita(int value) {
        if(this.brightness < 10){
            this.brightness++;
        }
    }

    @Override
    public void show() {
        String asterisk = "*";
        System.out.println("Il titolo è: " + getTitle() +" luminosità : " + asterisk.repeat(this.brightness));

    }
}
