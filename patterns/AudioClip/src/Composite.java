import javax.sound.sampled.Clip;
import java.util.ArrayList;
import java.util.Arrays;

public class Composite implements Shape {
    ArrayList<Shape> notes = new ArrayList<>();
    private String path;
    private int cycleCount;
    private int rate;
    private int volume;

    public void add (Shape... s){
        notes.addAll(Arrays.asList(s));
    }
    @Override
    public int setCycleCount(){
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
        for (Shape note: notes) {
            note.Play();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
