import instances.Audio;
import instances.Video;

public class PlayerMulti {
    static void main() {
        Video video = new Video(8, "Il giorno dei morti", 5, 4);
        video.play();


        Audio audio = new Audio(3, 10, "Le canzoni più belle");
        audio.play();
    }
}
