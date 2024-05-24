import entities.Audio;
import entities.Image;
import entities.Video;
import enums.TypeElement;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------AUDIO--------------------");
        Audio audio = new Audio("prova canzone",5,3, TypeElement.AUDIO);
        audio.play();
        System.out.println("-------------------VIDEO--------------------");
        Video video = new Video("prova video",5,3,8, TypeElement.VIDEO);
        video.play();
        System.out.println("-------------------IMAGE--------------------");
        Image image = new Image("prova immagine", 2, TypeElement.IMAGE);
        image.show();
    }
}