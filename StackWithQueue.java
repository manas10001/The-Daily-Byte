/*
Design a class to implement a stack using only a single queue. Your class, QueueStack, should support the following stack methods: push() (adding an item), pop() (removing an item), peek() (returning the top value without removing it), and empty() (whether or not the stack is empty).

Problem URL: https://leetcode.com/problems/implement-stack-using-queues/
*/
import java.util.*;

class StackWithQueue{
	Queue<Integer> q;
    Integer last;

    public StackWithQueue() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        last = x;
        q.add(x);
    }
    
    public int pop() {
        int remove = last;
            if (q.remove(last)) {
                if (q.size() > 0) {
                    last = (Integer) q.toArray()[q.size() - 1];
                }else{
                    last = Integer.MIN_VALUE;
                }

                return remove;
            }else{
                return Integer.MIN_VALUE;
            }
    }
    
    public int top() {
        return last;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

