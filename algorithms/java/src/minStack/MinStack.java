package minStack;

import java.util.Stack;

/**
 * @author kaizen
 * @date 2019/12/24
 */
public class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> min;

    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (min.isEmpty() || min.peek() > x) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            min.pop();
            data.pop();
        }
    }

    public int top() {
        if (data.isEmpty()) {
            throw new RuntimeException("data is empty");
        }
        return data.peek();
    }

    public int getMin() {
        if (min.isEmpty()) {
            throw new RuntimeException("Min is empty");
        }
        return min.peek();
    }
}
