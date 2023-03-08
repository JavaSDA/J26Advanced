package com.company.abstraction.audio;

public class AudioTest {
    public static void main(String[] args) {
        Playable mp3 = new Mp3player();
        mp3.play();

        Playable wav = new Wavplayer();
        wav.play();
    }
}
