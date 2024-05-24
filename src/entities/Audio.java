package entities;

import enums.TypeElement;
import interfaces.Play;

public class Audio extends MultimedialElement implements Play {

    public Audio(String title, int length, int volume , TypeElement typeElement) {
        super(title, length, volume, typeElement);
    }

    @Override
    public void play() {
        String puntoEsc = "!";
        for (int i = 0; i < getLength(); i++) {
            System.out.println("Il titolo è: " + getTitle() + " volume:  " +  puntoEsc.repeat(this.volume));
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
