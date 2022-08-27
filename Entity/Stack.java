/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nguye
 */
public class Stack {

    // max là số lượng max của stack có thể chứa;
    // top là cái stack ở trên cùng
    private int max,top;
    String[] stack;
    
    public Stack(int max) {
        this.max = max;
        stack = new String[this.max];
        top = -1;
    }
    
    public boolean grow() {
        int newMax = max + max / 4;
        String[] newStack = new String[newMax];
        if(newStack == null) {
            return false;
        }
        for(int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }
        max = newMax;
        stack = newStack;
        return true;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == max - 1);
    }
    
    public String push(String str) {
        if(isFull() && !grow()) {
            return null;
        } else {
            stack[++top] = str;
        }
        return str;
    }
    
    
    public String pop() {
        if(isEmpty()) {
            return null;
        }
        String str = stack[top];
        stack[top] = null;
        top = top - 1;
        return str;
    }
    
    public String top() {
        if(isEmpty()) {
            return null;
        }
        String str = stack[top];
        return str;
    }
    
    public void show() {
        String str = null;
        while((str = pop()) != null) {
            System.out.println(str);
        }
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
}
