package structures;
import models.Name;

public class LinkedStack {
    private Node top;
    
    public void push(Name value) {
        this.top = new Node(value, top);
    }
    
    public Name pop() {
        if(top == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        
        Name value = top.value;
        top = top.next;
        
        return value;
    }
    
    public void print() {
        if(top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        
        Node current = top;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    
    public boolean isEmpty() {
        return this.top == null;
    }
}
