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
    public void play() {
        String puntoEsc = "!";
        String asterisk = "*";
        for (int i = 0; i < getLength(); i++) {
            System.out.println("Il titolo è: " + getTitle() + " volume: " +  puntoEsc.repeat(this.volume) + " luminosità : " + asterisk.repeat(this.brightness));
        };
    }

    @Override
    public void abbassaVolume(int value) {
        if (this.volume > 0){
            this.volume--;
        }

    }

    @Override
    public void alzaVolume(int value) {
        if(this.volume < 10){
            this.volume++;
        }
    }
}
