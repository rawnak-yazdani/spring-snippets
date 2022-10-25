package io.welldev;

public class HelloWorld {
    private String message;

    public HelloWorld(){
        System.out.println("Constructor is called");
    }
    // This is called from Beans.xml
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
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
