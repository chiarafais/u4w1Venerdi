import entities.Audio;
import enums.TypeElement;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio("prova canzone",10,10, TypeElement.AUDIO);
        audio.play();

    }
}