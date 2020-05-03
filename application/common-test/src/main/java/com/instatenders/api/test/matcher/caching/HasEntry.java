package com.instatenders.api.test.matcher.caching;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.springframework.cache.Cache;

public class HasEntry<K, V> extends TypeSafeMatcher<Cache> {
    private final K key;

    public HasEntry(K key) {
        this.key = key;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("A cache having the an entry for the key " + key);
    }

    @Override
    protected boolean matchesSafely(Cache item) {
        return item.get(key) != null;
    }

    public static <K, V> Matcher<Cache> hasEntry(K key) {
        return new HasEntry<K, V>(key);
    }
}
