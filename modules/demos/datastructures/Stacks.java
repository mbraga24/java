package com.havefunwith.modules.demos.datastructures;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        // LIFO - Last In First Out

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(33);
        stack.push(44);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack empty: " + stack.empty());

    }

}
