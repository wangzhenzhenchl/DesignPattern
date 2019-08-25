package SingletonPattern;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MultitcmSingleton {
    static int n;

    private MultitcmSingleton(int n) {
        this.n = n;
    }
    private static ArrayList<MultitcmSingleton> list = new ArrayList<>();
    static {
        IntStream.range(1,5).forEach(e->list.add(new MultitcmSingleton(e)));
    }
    public static MultitcmSingleton getInstance(){
        int value = (int)(Math.random()*n)-1;
        return list.get(value);
    }

    public static void main(String[] args) {
        MultitcmSingleton multitcmSingleton = new MultitcmSingleton(5);
        MultitcmSingleton instance1 = MultitcmSingleton.getInstance();
        MultitcmSingleton instance2 = MultitcmSingleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
