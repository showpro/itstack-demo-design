package org.itstack.demo.design;

import java.util.concurrent.TimeUnit;

/**
 * 操作Redis服务接口
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
