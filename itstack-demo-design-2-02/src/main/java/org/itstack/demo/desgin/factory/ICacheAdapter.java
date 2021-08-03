package org.itstack.demo.desgin.factory;

import java.util.concurrent.TimeUnit;

/**
 * 由于集群A和集群B在部分⽅法提供上是不同的，因此需要做⼀个接⼝适配，⽽这个适配类就相当于⼯⼚中的⼯⼚，⽤于创建把不同的服务抽象为统⼀的接⼝做相同的业务
 * 适配接⼝，分别包装两个集群中差异化的接⼝名称
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
