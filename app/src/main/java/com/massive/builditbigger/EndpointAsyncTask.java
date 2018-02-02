//package com.massive.builditbigger;
//
//import android.content.Context;
//import android.os.AsyncTask;
//import android.widget.Toast;
//
//import com.google.api.client.extensions.android.http.AndroidHttp;
//import com.google.api.client.extensions.android.json.AndroidJsonFactory;
//import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
//import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
//
//import java.io.IOException;
//
//
//public class EndpointAsyncTask extends AsyncTask<Context, Void, String> {
//    private static JokeApi myApiService = null;
//    private Context context;
//
//    @Override
//    protected String doInBackground(Context... params) {
//        if (myApiService == null) {  // Only do this once
//            JokeApi.Builder builder = new
//                    JokeApi.Builder(AndroidHttp.newCompatibleTransport(),
//                    new AndroidJsonFactory(), null)
//                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
//                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
//                        @Override
//                        public void initialize(AbstractGoogleClientRequest<?>
//                                                       abstractGoogleClientRequest) throws IOException {
//                            abstractGoogleClientRequest.setDisableGZipContent(true);
//                        }
//                    });
//
//            myApiService = builder.build();
//        }
//
//        context = params[0];
//
//
//        try {
//            return myApiService.SayJoke().execute().getData();
//        } catch (IOException e) {
//            return e.getMessage();
//        }
//    }
//
//    @Override
//    protected void onPostExecute(String result) {
//        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
//    }
//}