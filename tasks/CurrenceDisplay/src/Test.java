import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\do.wav");
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
