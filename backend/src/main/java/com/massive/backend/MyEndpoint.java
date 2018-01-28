package com.massive.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.massive.com",
                ownerName = "backend.builditbigger.massive.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "SayJoke")
    public MyBean SayJoke(@Named("name") String Joke) {
        MyBean response = new MyBean();
        response.setData("HaHaHa, " + Joke);

        return response;
    }

}
