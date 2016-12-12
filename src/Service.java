/**
 * Created by Vlad on 12.12.2016.
 */
public class Service {
    private final int a;

    public Service(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void calc(int z) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += doCalc(z);
        }

    }
    private int doCalc(int z) {
        return (z + getA()) * 5;
    }

}
