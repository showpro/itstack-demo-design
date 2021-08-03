package org.itstack.demo.desgin.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理类的定义：抽象工厂
 */
public class JDKProxy {

    /**
     * @param interfaceClass 要被代理的类
     * @param cacheAdapter   使用哪个集群类型
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }

}
