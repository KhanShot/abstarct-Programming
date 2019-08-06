import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Mi implements Shape{
    private String path;
    int cycleCount;
    int rate;
    int volume;
    public Mi (String path, int cycleCount, int rate, int volume){
        this.cycleCount = cycleCount;
        this.rate = rate;
        this.volume= volume;
        this.path = path;
    }
    @Override
    public int setCycleCount() {
        return cycleCount;
    }

    @Override
    public int setRate() {
        return rate;
    }

    @Override
    public double setVolume() {
        return volume;
    }

    @Override
    public void Play() {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\mi.wav");
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.setFramePosition(0);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
}
