package com.massive.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;


public class JokeAsyncTaskTest extends AndroidTestCase {

    public void testJokeDownload() {

        try {
            EndpointAsyncTask task = new EndpointAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            assertThat(joke, notNullValue());
            assertTrue(joke.length() > 0);

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }

}