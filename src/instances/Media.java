package instances;

public abstract class Media {
    protected double duration;
    protected int volume;
    protected int brightness;

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Showing audio");
    }


}



