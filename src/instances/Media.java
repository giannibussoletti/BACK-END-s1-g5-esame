package instances;

public abstract class Media {
    protected int duration;
    protected int volume;
    protected int brightness;
    protected String title;

    //---------COSTRUTTORI-----------
    // Video
    public Media(int brightness, String title, int duration, int volume) {
        this.brightness = brightness;
        this.title = title;
        this.duration = duration;
        this.volume = volume;
    }

    // Audio
    public Media(int volume, int duration, String title) {
        this.duration = duration;
        this.volume = volume;
        this.title = title;
    }

    // Image
    public Media(int brightness, String title) {
        this.brightness = brightness;
        this.title = title;
    }

    //--------------METODI--------------
    // Brightness
    public void lowerBrightness() {
        if (brightness > 0) {
            --brightness;
        } else {
            System.out.println("La luminosità è già a zero");
        }
    }

    public void upperBrightness() {
        if (brightness < 10) {
            ++brightness;
        } else {
            System.out.println("La luminosità è già al massimo");
        }
    }

    // Volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void lowerVolume() {
        if (volume > 0) {
            --volume;
        } else {
            System.out.println("La luminosità è già a zero");
        }
    }

    public void upperVolume() {
        if (volume < 10) {
            ++volume;
        } else {
            System.out.println("La luminosità è già al massimo");
        }
    }


    @Override
    public String toString() {
        return "Media{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}



