package Task29;
import java.util.Arrays;
import java.util.Collection;

public class Juicer {

    void makeJuice(Collection<? extends Juiceable> juiceFruits) {
        for (Juiceable fruit : juiceFruits) {
            fruit.makeJuice();
        }
    }

    public static void main(String[] args) {
        Juicer juicer = new Juicer();
    }
}
