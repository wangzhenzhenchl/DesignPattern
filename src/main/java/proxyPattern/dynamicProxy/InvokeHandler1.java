package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface InvokeHandler1  {
    public Object invoke(Object p, Method m, Object[] args) throws InvocationTargetException, IllegalAccessException;
}
