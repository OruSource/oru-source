package com.instatenders.api.test.matcher.caching;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;

import static org.hamcrest.Matchers.equalTo;

public class HasEntryWithValue<K, V> extends TypeSafeMatcher<Cache> {
    private final K key;
    private final Matcher<V> valueMatcher;

    public HasEntryWithValue(K key, Matcher<V> valueMatcher) {
        this.key = key;
        this.valueMatcher = valueMatcher;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("A cache having an entry for the key " + key + " with a value ");
        valueMatcher.describeTo(description);
    }

    @Override
    protected boolean matchesSafely(Cache item) {
        ValueWrapper valueWrapper = item.get(key);
        boolean matches;
        if (valueWrapper == null) {
            matches = false;
        } else {
            matches = valueMatcher.matches(valueWrapper.get());
        }
        return matches;
    }

    public static <K, V> Matcher<Cache> hasEntryWithValue(K key, V value) {
        return new HasEntryWithValue<K, V>(key, equalTo(value));
    }

    public static <K, V> Matcher<Cache> hasEntryWithValue(K key, Matcher<V> valueMatcher) {
        return new HasEntryWithValue<K, V>(key, valueMatcher);
    }
}
