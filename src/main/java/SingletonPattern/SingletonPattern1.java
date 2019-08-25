package SingletonPattern;

public class SingletonPattern1 {
    private static final SingletonPattern1 singletonPattern1 = new SingletonPattern1();
    private SingletonPattern1() {
    }
    public static SingletonPattern1 getSingletonInstance(){
        return singletonPattern1;
    }
    public static void main(String[] args) {
        SingletonPattern1 singletonPattern1 = SingletonPattern1.getSingletonInstance();
        SingletonPattern1 singletonPattern2 = SingletonPattern1.getSingletonInstance();
        System.out.println(singletonPattern1==singletonPattern2);
    }
}
