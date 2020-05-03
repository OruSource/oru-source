package com.instatenders.api.test.matcher;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;

/**
 * This matcher will record the last object that was matched against so that it can be later
 * inspected.
 */
public class RecordingArgumentThat<T> extends Is<T> {
    private T lastObjectMatched;

    public RecordingArgumentThat(Matcher<T> matcher) {
        super(matcher);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean matches(Object arg) {
        lastObjectMatched = (T)arg;
        return super.matches(arg);
    }

    public T getLastObjectMatched() {
        return lastObjectMatched;
    }

    public static <T> RecordingArgumentThat<T> recordingArgumentThat(Matcher<T> matcher) {
        return new RecordingArgumentThat<T>(matcher);
    }
}
