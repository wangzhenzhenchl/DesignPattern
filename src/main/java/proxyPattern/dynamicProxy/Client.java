package proxyPattern.dynamicProxy;


import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Object subject = null;
        InvokeHandler handler = null;
        handler= new DynamicProxy(new RealSubject1());
        subject  =(AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class}, (InvocationHandler) handler);
        ((AbstractSubject) subject).request();
    }
}
