import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

/**
 * Created by Arthur on 02/05/2017.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass (double cutoff) {
        this.cutoff = cutoff;
    }
    public WaveForm process(WaveForm input) {
        return input;
    }
}
