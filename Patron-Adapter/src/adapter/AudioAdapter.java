package adapter;

import adaptee.LegacyAudioLib;
import target.MediaPlayer;

public class AudioAdapter implements MediaPlayer {
    private final LegacyAudioLib legacyLib;

    public AudioAdapter(LegacyAudioLib legacyLib){
        this.legacyLib=legacyLib;
    }

    @Override
    public void play(String fileName) {
        legacyLib.playOldFormat(fileName);
    }
}