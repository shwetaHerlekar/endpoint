package com.example.helloworld;

public class HelloClass {
       public String message="Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}