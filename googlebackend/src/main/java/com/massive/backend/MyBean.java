package com.massive.backend;
import com.massive.javajokes.*;
/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Jokes myJoke = new Jokes();

    public String getData() {
        return myJoke.getJoke();
    }

//    public void setData(String data) {
//        myData = data;
//    }
}