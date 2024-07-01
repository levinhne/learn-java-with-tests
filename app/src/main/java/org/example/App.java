package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        App app = new App();

        // Object class example
        app.objectClassExample();
    }

    public void objectClassExample() {
        Object obj = new String("Java tutorial");
        Object obj2 = new String("Java tutorial");

        Class s = obj.getClass();
        System.out.println("getName: " + s.getName()); // java.lang.String 
        System.out.println("hashCode: " + s.hashCode()); // int 
        System.out.println("equals: " + s.equals(obj2)); // false
        System.out.println("toString: " + s.toString()); // class java.lang.String

    }
    // deprecated - removed Java 18
    //@Override 
    //protected void finalize() {
    //    System.out.println("finalize method called");
    //}
}
