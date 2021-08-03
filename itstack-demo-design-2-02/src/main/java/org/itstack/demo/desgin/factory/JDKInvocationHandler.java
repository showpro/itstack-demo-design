package org.itstack.demo.desgin.factory;

import org.itstack.demo.desgin.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类实现：工厂实现，通过穿透进来的集群服务进⾏⽅法操作
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    //在 invoke 中通过使⽤获取⽅法名称反射⽅式，调⽤对应的⽅法功能，也就简化了整体的使⽤
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }

}
