import java.util.Arrays;

interface Processor {
    String name();
    Object process(Object input);
}

class Upcase extends StringProcessor {

    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor {

    public String process(Object input) {
        return ((String)input).toLowerCase();
    }

}
class Splitter  extends StringProcessor {

    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }

}
class Apply{
    public static void process(Processor p, Object s) {
        System.out.println("Используем Processor: " + p.name());
        System.out.println(p.process(s));
    }
}

abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);

    static String s = "RanDimasd adjwWAdj ASdaD";

    public static void main(String[] args) {
        WaveForm waveForm = new WaveForm();

        Apply.process(new FilterAdapter(new LowPass(2.0)), waveForm);


//        Apply.process(new Upcase(),s);
//        Apply.process(new Downcase(),s);
//        Apply.process(new Splitter(), s);
    }
}



class FilterAdapter implements Processor {

    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Object process(Object input) {
        return filter.process((WaveForm)input);
    }
}
