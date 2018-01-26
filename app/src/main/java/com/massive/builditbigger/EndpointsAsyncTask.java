package com.massive.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;

import com.massive.backend.MyEndpoint;

/**
 * Created by minafaw on 1/26/2018.
 */

public class EndpointsAsyncTask extends AsyncTask<Pair<Context,String>,Void, String> {
    private static MyEndpoint myApiService = null;
    private Context context;
    @Override
    protected String doInBackground(Pair<Context, String>[] pairs) {

        return null;
    }
}
