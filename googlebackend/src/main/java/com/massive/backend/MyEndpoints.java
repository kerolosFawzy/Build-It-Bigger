package com.massive.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.massive.javajokes.Jokes;

@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.massive.com",
                ownerName = "backend.massive.com",
                packagePath = ""
        )
)
public class MyEndpoints {

    @ApiMethod(name = "SayJoke")
    public MyBean SayJoke() {
        Jokes jokes = new Jokes();
        MyBean myBean = new MyBean();
        myBean.setData(jokes.getJoke());
        return myBean;
    }

}
