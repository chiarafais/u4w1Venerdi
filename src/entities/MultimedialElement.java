package entities;

import enums.TypeElement;

public abstract class MultimedialElement {

    protected String title;
    protected  int volume;
    protected int length; //durata audio/video
    protected int brightness;
    protected TypeElement typoElement;

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public int getBrightness() {
        return brightness;
    }

    //video
    public MultimedialElement(String title, int length, int volume, int brightness, TypeElement typoElement) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;
        this.typoElement = typoElement;
    }

    //image
    public MultimedialElement(String title, int brightness,TypeElement typoElement) {
        this.title = title;
        this.brightness = brightness;
        this.typoElement = typoElement;
    }

    //audio
    public MultimedialElement(String title, int length, int volume,TypeElement typoElement) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.typoElement = typoElement;
    }
}
