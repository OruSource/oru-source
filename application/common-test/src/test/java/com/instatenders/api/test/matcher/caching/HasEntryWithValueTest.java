package com.instatenders.api.test.matcher.caching;

import org.hamcrest.StringDescription;
import org.junit.jupiter.api.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static com.instatenders.api.test.matcher.caching.HasEntryWithValue.hasEntryWithValue;

public class HasEntryWithValueTest {
    @Test
    public void matches() {
        Cache cache = new ConcurrentMapCache("test-cache");
        cache.put("foo", "bar");
        assertThat(hasEntryWithValue("foo", "bar").matches(cache), is(true));
        assertThat(hasEntryWithValue("foo", "baz").matches(cache), is(false));
    }

    @Test
    public void matchesIsFalseIfNoEntryExists() {
        Cache cache = new ConcurrentMapCache("test-cache");
        assertThat(hasEntryWithValue("foo", "baz").matches(cache), is(false));
    }

    @Test
    public void describeTo() {
        StringDescription description = new StringDescription();
        hasEntryWithValue("foo", equalTo("bar")).describeTo(description);
        assertThat(description.toString(), is(equalTo(
                "A cache having an entry for the key foo with a value \"bar\"")));

        description = new StringDescription();
        hasEntryWithValue("foo", containsString("bar")).describeTo(description);
        assertThat(description.toString(), is(equalTo(
                "A cache having an entry for the key foo with a value a string containing \"bar\"")));
    }
}
