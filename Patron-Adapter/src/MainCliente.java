import adaptee.LegacyAudioLib;
import adapter.AudioAdapter;
import client.VideoApp;
import target.MediaPlayer;

public class MainCliente {
    static void main(String[] args) {
        LegacyAudioLib legacy=new LegacyAudioLib();
        MediaPlayer adapter=new AudioAdapter(legacy);
        VideoApp app=new VideoApp(adapter);

        app.openFile("cancion.mp3");
    }
}
