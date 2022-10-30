package io.welldev.beans;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(int x) {
        System.out.println("Constructor is called: " + x);
    }

    // This is called from Beans.xml
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    // This is called from Beans.xml
    public void init() {
        System.out.println("Bean is going through init.");
    }

    // This is called from Beans.xml
    public void destroy() {
        System.out.println("Bean will be destroyed now!");
    }
}
