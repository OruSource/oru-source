package com.instatenders.api.test.matcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.sameInstance;

import static com.instatenders.api.test.matcher.RecordingArgumentThat.recordingArgumentThat;

public class RecordingArgumentThatTest {
    @Test
    public void matches() {
        Object object = new Object();
        RecordingArgumentThat<Object> matcher = recordingArgumentThat(sameInstance(object));
        assertThat(matcher.matches(object), is(true));
        assertThat(matcher.matches(new Object()), is(false));
    }

    @Test
    public void getLastObjectMatched() {
        Object object = new Object();
        RecordingArgumentThat<Object> matcher = recordingArgumentThat(sameInstance(object));
        matcher.matches(object);
        assertThat(matcher.getLastObjectMatched(), is(sameInstance(object)));

        Object object2 = new Object();
        matcher.matches(object2);
        assertThat(matcher.getLastObjectMatched(), is(sameInstance(object2)));
    }
}
