package ChainofResponsibilityPattern;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        Handler h3= new ConcreteHandler();
        h2.setNextHandler(h3);
        h1.setNextHandler(h2);   //h1的下一个处理器是h2
        h1.handleRequest();
    }
}