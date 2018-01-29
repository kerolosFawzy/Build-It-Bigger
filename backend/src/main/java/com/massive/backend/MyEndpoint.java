package com.massive.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.massive.javajokes.Jokes;
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.massive.com",
                ownerName = "backend.massive.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "SayJoke")
    public MyBean SayJoke(Jokes Joke) {
        MyBean response = new MyBean();
        response.setData("HaHaHa, " + Joke.getJoke());
        return response;
    }

}
