package com.instatenders.api.test.matcher.time;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class WithinTimeRange extends TypeSafeMatcher<Date> {
    private final Date expectedDate;
    private final long timeInterval;
    private final TimeUnit timeUnit;

    public WithinTimeRange(Date expectedDate, long timeInterval, TimeUnit timeUnit) {
        this.expectedDate = expectedDate;
        this.timeInterval = timeInterval;
        this.timeUnit = timeUnit;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("A date within " + timeInterval + " " + timeUnit + " of " +
                expectedDate);
    }

    @Override
    protected boolean matchesSafely(Date item) {
        long expectedTime = expectedDate.getTime();
        long actualTime = item.getTime();
        long timeDifferenceInMilliseconds = Math.abs(expectedTime - actualTime);
        long allowableDifferenceInMilliseconds = timeUnit.toMillis(timeInterval);
        boolean matches = timeDifferenceInMilliseconds <= allowableDifferenceInMilliseconds;
        return matches;
    }

    public static final Matcher<Date> withinMillisecondsOf(long numberOfMilliseconds,
            Date expectedDate) {
        return new WithinTimeRange(expectedDate, numberOfMilliseconds, TimeUnit.MILLISECONDS);
    }

    public static final Matcher<Date> withinSecondsOf(long numberOfSeconds,
            Date expectedDate) {
        return new WithinTimeRange(expectedDate, numberOfSeconds, TimeUnit.SECONDS);
    }

    public static final Matcher<Date> withinMinutesOf(long numberOfMinutes,
            Date expectedDate) {
        return new WithinTimeRange(expectedDate, numberOfMinutes, TimeUnit.MINUTES);
    }
}
