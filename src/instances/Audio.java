package instances;

import interfaces.Playable;

public class Audio extends Media implements Playable {


    public Audio(int volume, int duration, String title) {
        super(volume, duration, title);
    }

    @Override
    public void upperVolume() {
        super.upperVolume();
    }

    @Override
    public void lowerVolume() {
        super.lowerVolume();
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + "!".repeat(volume));
        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}
