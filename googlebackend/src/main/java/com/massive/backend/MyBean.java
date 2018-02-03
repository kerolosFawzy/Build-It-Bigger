package com.massive.backend;
import com.massive.javajokes.Jokes;

public class MyBean {

    private Jokes myJoke = new Jokes();

    public String getData() {
        return myJoke.getJoke();
    }

//    public void setData(String data) {
//        myData = data;
//    }
}