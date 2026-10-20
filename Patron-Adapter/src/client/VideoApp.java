package client;

import target.MediaPlayer;

public class VideoApp {
    private final MediaPlayer player;

    public VideoApp(MediaPlayer player){
        this.player=player;
    }

    public void openFile(String file){
        player.play(file);
    }
}