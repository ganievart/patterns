/**
 * Created by Arthur on 02/05/2017.
 */
public class WaveForm {
    private static long counter;
    private final long id = counter ++;
    public String toString() {
        return "Waveform " + id;
    }
}
