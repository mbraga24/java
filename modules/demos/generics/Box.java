package com.havefunwith.modules.demos.generics;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect("some text"); // error: this is still String!
    }

//    https://docs.oracle.com/javase/tutorial/java/generics/bounded.html#:~:text=There%20may%20be%20times%20when,bounded%20type%20parameters%20are%20for.

}
