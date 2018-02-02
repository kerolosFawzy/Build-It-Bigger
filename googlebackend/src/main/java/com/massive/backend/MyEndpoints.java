package com.massive.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
//import com.massive.javajokes.Jokes;
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
    public MyBean SayJoke(@Named("Joke") String Joke) {
        MyBean response = new MyBean();
        response.setData("HaHaHa, " + Joke);
        return response;
    }

}
