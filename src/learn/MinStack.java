package learn;

import netscape.security.UserTarget;

import java.util.LinkedList;

/**
 * 设计一个支持 push，pop，top 操作
 * 并能在常数时间内检索到最小元素的栈
 */
public class MinStack {

    /** initialize your data structure here. */

    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;
    int min;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.addLast(x);
        if (minStack.isEmpty()) {
            min = Integer.MAX_VALUE;
        }
        min = Math.min(min, x);
        minStack.addLast(min);
    }

    public void pop() {
        stack.removeLast();
        minStack.removeLast();
        if (!minStack.isEmpty()) {
            min = minStack.getLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }
}