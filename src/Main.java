import entities.Audio;
import entities.Video;
import enums.TypeElement;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------AUDIO--------------------");
        Audio audio = new Audio("prova canzone",5,3, TypeElement.AUDIO);
        audio.play();
        System.out.println("-------------------VIDEO--------------------");
        Video video = new Video("prova video",5,3,4, TypeElement.VIDEO);
        video.play();
    }
}