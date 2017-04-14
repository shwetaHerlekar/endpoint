package com.example.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
//import com.google.appengine.api.urlfetch.HTTPResponse;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import java.util.Collections;


@Api(
    name = "helloworldendpoints", 
    version = "v1",
    description = "API for hello world endpoints."
    )

public class HelloWorldEndpoints{

   // Make this method available externally through Endpoints
    @ApiMethod(name = "sayHello", path = "sayHello", httpMethod = HttpMethod.GET)
    public HelloClass sayHello() {
        return new HelloClass();
    }

    // Make this method available externally through Endpoints
    @ApiMethod(name = "sayHelloByName", path = "sayHelloByName", httpMethod = HttpMethod.GET)
    public HelloClass sayHelloByName (@Named("name") String name) throws Exception{
        return new HelloClass(name);
    }
}