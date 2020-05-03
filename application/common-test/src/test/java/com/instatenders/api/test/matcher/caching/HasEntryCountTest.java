package com.instatenders.api.test.matcher.caching;

import org.hamcrest.StringDescription;
import org.junit.jupiter.api.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.NoOpCache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static com.instatenders.api.test.matcher.caching.HasEntryCount.hasEntryCount;

public class HasEntryCountTest {
    @Test
    public void matches() {
        Cache cache = new ConcurrentMapCache("test-cache");
        cache.put("foo", "bar");
        assertThat(HasEntryCount.hasEntryCount(1).matches(cache), is(true));
        assertThat(HasEntryCount.hasEntryCount(5).matches(cache), is(false));
    }

    @Test
    public void matchesThrowsIllegalArgumentExceptionIfCacheIsNotConcurrentMapCache() {
        Cache cache = new NoOpCache("foo");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            HasEntryCount.hasEntryCount(1).matches(cache);
        });
        assertThat(exception.getMessage(), is(equalTo("Unsupported cache of type " + cache.getClass())));
    }

    @Test
    public void describeTo() {
        StringDescription description = new StringDescription();
        HasEntryCount.hasEntryCount(equalTo(5)).describeTo(description);
        assertThat(description.toString(), is(equalTo("A cache with <5> entries")));

        description = new StringDescription();
        HasEntryCount.hasEntryCount(lessThan(5)).describeTo(description);
        assertThat(description.toString(), is(equalTo("A cache with a value less than <5> entries")));
    }

    @Test
    public void describeMismatchSafely() {
        Cache cache = new ConcurrentMapCache("test-cache");
        cache.put("foo", "bar");

        StringDescription description = new StringDescription();
        HasEntryCount.hasEntryCount(equalTo(5)).describeMismatch(cache, description);
        assertThat(description.toString(), is(equalTo("A cache with 1 entries")));
    }
}
