package com.massive.builditbigger;

import android.content.Context;

import com.google.appengine.repackaged.com.google.common.base.Pair;

import static org.junit.Assert.assertNotNull;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest  {

    private static final String LOG_TAG = "NotNullJoke";

    @SuppressWarnings("unchecked")
    public void test() {
        String result = null;
        EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(new Pair<Context, String>(this, null));
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}