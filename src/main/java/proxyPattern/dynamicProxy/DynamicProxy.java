package proxyPattern.dynamicProxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxy implements InvokeHandler {
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

   public Object invoke(Object p, Method m , Object[] args) throws InvocationTargetException, IllegalAccessException {
        m.invoke(obj,args);
        return null;
   }


    @Override
    public OutputStream _invoke(String method, InputStream input, ResponseHandler handler) throws SystemException {
        return null;
    }
}
