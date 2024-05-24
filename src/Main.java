import entities.Audio;
import entities.Image;
import entities.MultimedialElement;
import entities.Video;
import enums.TypeElement;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       String title;
       int volume;
       int length; //durata audio/video
       int brightness;
       TypeElement typoElement;


//        System.out.println("-------------------AUDIO--------------------");
//        Audio audio = new Audio("prova canzone",5,3, TypeElement.AUDIO);
//        audio.play();
//        System.out.println("-------------------VIDEO--------------------");
//        Video video = new Video("prova video",5,3,8, TypeElement.VIDEO);
//        video.play();
//        System.out.println("-------------------IMAGE--------------------");
//        Image image = new Image("prova immagine", 5, TypeElement.IMAGE);
//        image.show();


       MultimedialElement[] arrayFive = new MultimedialElement[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("scegli 5 file multimediali: ");


       for (int i=0; i< arrayFive.length; i++){
           System.out.println("quale file scegli: AUDIO, VIDEO, IMAGE ?");
           String text = sc.nextLine();
           TypeElement tipo = TypeElement.valueOf(text);

           switch(tipo) {
               case AUDIO: {
                   System.out.println("hai scelto AUDIO, ora inserisci un titolo: ");
                   title = sc.nextLine();
                   System.out.println("dimmi la durata : ");
                   length = Integer.parseInt(sc.nextLine());
                   System.out.println("il volume da 0 a 10 : ");
                   volume = Integer.parseInt(sc.nextLine());
                   arrayFive[i] = new Audio (title,length,volume,tipo);
                   break;
               }
               case VIDEO : {
                   System.out.println("hai scelto VIDEO, ora inserisci un titolo: ");
                   title = sc.nextLine();
                   System.out.println("dimmi la durata : ");
                   length = Integer.parseInt(sc.nextLine());
                   System.out.println("il volume da 0 a 10 : ");
                   volume = Integer.parseInt(sc.nextLine());
                   System.out.println("la luminosità da 0 a 10 : ");
                   brightness = Integer.parseInt(sc.nextLine());
                   arrayFive[i] = new Video (title,length,volume,brightness,tipo);
                   break;
               }
               case IMAGE:{
                   System.out.println("hai scelto IMAGE, ora inserisci un titolo: ");
                   title = sc.nextLine();
                   System.out.println("la luminosità da 0 a 10 : ");
                   brightness = Integer.parseInt(sc.nextLine());
                   arrayFive[i] = new Image (title,brightness,tipo);
                   break;
               }
               default:
                   System.out.println("errore");
                   break;
           }


       }
       while (true){
           System.out.println("inserisci un numero da 1 a 5 per scegliere uno degli elementi che hai inserito!");
           int numSelect = Integer.parseInt(sc.nextLine());
           if(numSelect == 0){
               break;
           }if (numSelect >= 1 && numSelect <= 5){
               MultimedialElement element = arrayFive[numSelect - 1];
               if(element instanceof Image){
                   ((Image) element).show();
               }
               if(element instanceof Audio){
                   ((Audio) element).play();
               }
               if(element instanceof Video){
                   ((Video) element).play();
               }

           }

       }

    }
}