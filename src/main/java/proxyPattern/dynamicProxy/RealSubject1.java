package proxyPattern.dynamicProxy;

public class RealSubject1 implements AbstractSubject {
    public void request() {
        System.out.println("RealSubject1.....");
    }
}
