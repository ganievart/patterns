/**
 * Created by Arthur on 02/05/2017.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm input) {
        return input;
    }
}

