package com.instatenders.api.test.caching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;

public class TestCacheManagerFactoryBean implements FactoryBean<CacheManager> {
    public static final Object NO_ARGUMENT_CACHE_KEY = 0;

    private final List<String> cacheNames;

    public TestCacheManagerFactoryBean(String... cacheNames) {
        this(Arrays.asList(cacheNames));
    }

    public TestCacheManagerFactoryBean(List<String> cacheNames) {
        this.cacheNames = cacheNames;
    }

    @Override
    public CacheManager getObject() {
        List<Cache> caches = new ArrayList<>(cacheNames.size());
        for (String name : cacheNames) {
            caches.add(createCache(name));
        }
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(caches);
        cacheManager.afterPropertiesSet();
        return cacheManager;
    }

    private Cache createCache(String name) {
        return new ConcurrentMapCache(name);
    }

    @Override
    public Class<?> getObjectType() {
        return CacheManager.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
