package com.massive.builditbigger;

import android.content.Context;

import com.google.appengine.repackaged.com.google.common.base.Pair;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private static final String LOG_TAG = "NotNullJoke";
    private final CountDownLatch mSignal = new CountDownLatch(1);

    @Test
    public void testJokeRetriever() {
        new EndpointAsyncTask().execute(new Pair<Context, String>(this, null));
        try {
            boolean success = mSignal.await(5, TimeUnit.SECONDS);
            if (!success) {
                fail("Test timed out, make sure the server is actually running.");
            }else {
                assertTrue(success);
                mSignal.countDown();
            }
        } catch (InterruptedException e) {
            fail();
        }
    }

}