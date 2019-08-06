import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Do implements Shape{
    private int CycleCount, rate;
    private int volume;
    private String path;
    public Do(String path, int c, int rate, int volume){
        this.path = path;
        this.CycleCount = c;
        this.rate = (int) rate;
        this.volume = volume;
    }
    @Override
    public int setCycleCount() {
        return CycleCount;
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
            File file = new File("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\do.wav");
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
