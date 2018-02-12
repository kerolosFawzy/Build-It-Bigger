package com.massive.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;


public class ExampleUnitTest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void testJokeRetriever() {
        String Joke = null;
        EndpointAsyncTask asyncTask = new EndpointAsyncTask();
        asyncTask.execute(new Pair<Context, String>(getContext(), null));

        try {
            Joke = asyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(Joke);
    }

}