package com.massive.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;


public class ExampleUnitTest {

    private static final String LOG_TAG = "NotNullJoke";
    private final CountDownLatch mSignal = new CountDownLatch(1);
    Context context;

    @Before
    public void setup() {
        context = new MainActivity().context;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testJokeRetriever() {
        EndpointAsyncTask asyncTask = new EndpointAsyncTask();
        asyncTask.execute(new Pair<Context, String>(context, null));
        String s = null;
        try {
            s = asyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(s);
    }

}