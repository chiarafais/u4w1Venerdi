package entities;

import interfaces.Play;

public class Audio extends MultimedialElement implements Play {

    public Audio(String title, int length, int volume) {
        super(title, length, volume);
    }

    @Override
    public void play() {

    }

    @Override
    public void abbassaVolume(int value) {

    }

    @Override
    public void alzaVolume(int value) {

    }
}
