package com.instatenders.api.test.caching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.cache.CacheManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class TestCacheManagerFactoryBeanTest {
    @Test
    public void getObject() throws Exception {
        CacheManager manager = new TestCacheManagerFactoryBean("fizz", "buzz").getObject();
        ((InitializingBean)manager).afterPropertiesSet();
        assertThat(manager.getCache("fizz"), is(notNullValue()));
        assertThat(manager.getCache("buzz"), is(notNullValue()));
        assertThat(manager.getCache("baz"), is(nullValue()));
    }

    @Test
    public void getObjectType() {
        assertThat(new TestCacheManagerFactoryBean().getObjectType(), is(CacheManager.class));
    }

    @Test
    public void isSingleton() {
        assertThat(new TestCacheManagerFactoryBean().isSingleton(), is(true));
    }
}
