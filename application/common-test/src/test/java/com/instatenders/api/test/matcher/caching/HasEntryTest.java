package com.instatenders.api.test.matcher.caching;

import org.hamcrest.StringDescription;
import org.junit.jupiter.api.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HasEntryTest {
    @Test
    public void matches() {
        Cache cache = new ConcurrentMapCache("test-cache");
        cache.put("foo", "bar");
        assertThat(HasEntry.hasEntry("foo").matches(cache), is(true));
        assertThat(HasEntry.hasEntry("bar").matches(cache), is(false));
    }

    @Test
    public void describeTo() {
        StringDescription description = new StringDescription();
        HasEntry.hasEntry("foo").describeTo(description);
        assertThat(description.toString(), is(equalTo("A cache having the an entry for the key foo")));
    }
}
