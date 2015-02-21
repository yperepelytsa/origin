package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
    	System.out.println("Hello " + name + "!");
        this.message = "Hello " + name + "!";
    }
    public HelloClass (String name,String period) {
    	System.out.println("Good " + period + " " + name + "!");
        this.message = "Good " + period + " " + name + "!";
    }
    public String getMessage() {
        return message;
    }
}
