package com.massive.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

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
    public MyBean SayJoke(MyBean Joke) {
        return Joke;
    }

}
