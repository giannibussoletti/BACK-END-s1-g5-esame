package instances;


import interfaces.Playable;


public class Video extends Media implements Playable {

    public Video(int brightness, String title, int duration, int volume) {
        super(brightness, title, duration, volume);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public void upperBrightness() {
        super.upperBrightness();
    }

    @Override
    public void lowerBrightness() {
        super.lowerBrightness();
    }

    @Override
    public void lowerVolume() {
        super.lowerVolume();
    }

    @Override
    public void upperVolume() {
        super.upperVolume();
    }


    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + "!".repeat(volume) + "*".repeat(brightness));
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}
