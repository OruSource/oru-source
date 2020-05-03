package com.instatenders.api.test.matcher.caching;

import java.util.Map;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;

import static org.hamcrest.Matchers.equalTo;

public class HasEntryCount extends TypeSafeMatcher<Cache> {
    private final Matcher<Integer> countMatcher;

    public HasEntryCount(Matcher<Integer> countMatcher) {
        this.countMatcher = countMatcher;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("A cache with ");
        countMatcher.describeTo(description);
        description.appendText(" entries");
    }

    @Override
    protected void describeMismatchSafely(Cache item, Description mismatchDescription) {
        mismatchDescription.appendText("A cache with " + getNumberOfEntries(item) + " entries");
    }

    private int getNumberOfEntries(Cache item) {
        int numberOfEntries;
        if (item instanceof ConcurrentMapCache) {
            numberOfEntries = ((Map<?, ?>)item.getNativeCache()).size();
        } else {
            throw new IllegalArgumentException("Unsupported cache of type " + item.getClass());
        }
        return numberOfEntries;
    }

    @Override
    protected boolean matchesSafely(Cache item) {
        return countMatcher.matches(getNumberOfEntries(item));
    }

    public static Matcher<Cache> hasEntryCount(Matcher<Integer> countMatcher) {
        return new HasEntryCount(countMatcher);
    }

    public static Matcher<Cache> hasEntryCount(int count) {
        return new HasEntryCount(equalTo(count));
    }
}
