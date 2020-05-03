package com.instatenders.api.test.matcher.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

public class WithinTimeRangeTest {
    private static final int ALLOWED_TIME_DIFFERENCE = 8;

    @Test
    public void withinTimeRangeForTimeAfter() {
        Calendar now = new GregorianCalendar();
        Calendar timeAfter = new GregorianCalendar();
        timeAfter.setTime(now.getTime());
        timeAfter.add(Calendar.MILLISECOND, ALLOWED_TIME_DIFFERENCE);

        Matcher<Date> matcher = new WithinTimeRange(now.getTime(), ALLOWED_TIME_DIFFERENCE,
                TimeUnit.MILLISECONDS);
        assertThat(matcher.matches(timeAfter.getTime()), is(true));
    }

    @Test
    public void withinTimeRangeForTimeBefore() {
        Calendar now = new GregorianCalendar();
        Calendar timeAfter = new GregorianCalendar();
        timeAfter.setTime(now.getTime());
        timeAfter.add(Calendar.MILLISECOND, -ALLOWED_TIME_DIFFERENCE);

        Matcher<Date> matcher = new WithinTimeRange(now.getTime(), ALLOWED_TIME_DIFFERENCE,
                TimeUnit.MILLISECONDS);
        assertThat(matcher.matches(timeAfter.getTime()), is(true));
    }

    @Test
    public void withinTimeRangeForTimeBetween() {
        Calendar now = new GregorianCalendar();
        Calendar timeAfter = new GregorianCalendar();
        timeAfter.setTime(now.getTime());
        timeAfter.add(Calendar.MILLISECOND, ALLOWED_TIME_DIFFERENCE - 1);

        Matcher<Date> matcher = new WithinTimeRange(now.getTime(), ALLOWED_TIME_DIFFERENCE,
                TimeUnit.MILLISECONDS);
        assertThat(matcher.matches(timeAfter.getTime()), is(true));
    }

    @Test
    public void withinTimeRangeIsFalseIfTimeIsAfterAllowedRange() {
        Calendar now = new GregorianCalendar();
        Calendar timeAfter = new GregorianCalendar();
        timeAfter.setTime(now.getTime());
        timeAfter.add(Calendar.MILLISECOND, ALLOWED_TIME_DIFFERENCE + 1);

        Matcher<Date> matcher = new WithinTimeRange(now.getTime(), ALLOWED_TIME_DIFFERENCE,
                TimeUnit.MILLISECONDS);
        assertThat(matcher.matches(timeAfter.getTime()), is(false));
    }

    @Test
    public void withinTimeRangeIsFalseIfTimeIsBeforeAllowedRange() {
        Calendar now = new GregorianCalendar();
        Calendar timeAfter = new GregorianCalendar();
        timeAfter.setTime(now.getTime());
        timeAfter.add(Calendar.MILLISECOND, -ALLOWED_TIME_DIFFERENCE - 1);

        Matcher<Date> matcher = new WithinTimeRange(now.getTime(), ALLOWED_TIME_DIFFERENCE,
                TimeUnit.MILLISECONDS);
        assertThat(matcher.matches(timeAfter.getTime()), is(false));
    }

    @Test
    public void withinMillisecondsOf() {
        Instant instant = Instant.now();
        Matcher<Date> matcher = WithinTimeRange.withinMillisecondsOf(1, Date.from(instant));
        assertThat(matcher.matches(Date.from(instant)), is(true));
        assertThat(matcher.matches(Date.from(instant.minusMillis(1))), is(true));
        assertThat(matcher.matches(Date.from(instant.minusMillis(2))), is(false));
        assertThat(matcher.matches(Date.from(instant.plusMillis(1))), is(true));
        assertThat(matcher.matches(Date.from(instant.plusMillis(2))), is(false));
    }

    @Test
    public void withinSecondsOf() {
        Instant instant = Instant.now();
        Matcher<Date> matcher = WithinTimeRange.withinSecondsOf(1, Date.from(instant));
        assertThat(matcher.matches(Date.from(instant)), is(true));
        assertThat(matcher.matches(Date.from(instant.minusSeconds(1))), is(true));
        assertThat(matcher.matches(Date.from(instant.minusSeconds(2))), is(false));
        assertThat(matcher.matches(Date.from(instant.plusSeconds(1))), is(true));
        assertThat(matcher.matches(Date.from(instant.plusSeconds(2))), is(false));
    }

    @Test
    public void withinMinutesOf() {
        Instant instant = Instant.now();
        Matcher<Date> matcher = WithinTimeRange.withinMinutesOf(1, Date.from(instant));
        assertThat(matcher.matches(Date.from(instant)), is(true));
        assertThat(matcher.matches(Date.from(instant.minus(1, ChronoUnit.MINUTES))), is(true));
        assertThat(matcher.matches(Date.from(instant.minus(2, ChronoUnit.MINUTES))), is(false));
        assertThat(matcher.matches(Date.from(instant.plus(1, ChronoUnit.MINUTES))), is(true));
        assertThat(matcher.matches(Date.from(instant.plus(2, ChronoUnit.MINUTES))), is(false));
    }

    @Test
    public void describeTo() {
        StringDescription description = new StringDescription();
        WithinTimeRange.withinMinutesOf(1, new Date()).describeTo(description);
        assertThat(description.toString(), startsWith("A date within 1 MINUTES of "));
    }
}
