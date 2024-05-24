package entities;

public abstract class MultimedialElement {

    protected String title;
    protected  int volume;
    protected int length;
    protected int brightness;

    //video
    public MultimedialElement(String title, int length, int volume, int brightness) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;
    }

    //image
    public MultimedialElement(String title, int brightness) {
        this.title = title;
        this.brightness = brightness;
    }

    //audio
    public MultimedialElement(String title, int length, int volume) {
        this.title = title;
        this.length = length;
        this.volume = volume;

    }
}
