package instances;

import interfaces.Showed;

public class Image extends Media implements Showed {

    public Image(int brightness, String title) {
        super(brightness, title);
    }


    @Override
    public void lowerBrightness() {
        super.lowerBrightness();
    }

    @Override
    public void upperBrightness() {
        super.upperBrightness();
    }

    @Override
    public void show() {
        System.out.println(title + "*".repeat(brightness));
    }
}

