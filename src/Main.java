import structures.LinkedStack;
import models.Name;
public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack(); 
        
        // Fill the stack with all enum values
        Name[] names = Name.values();
        for(int i = names.length - 1; i >= 0; i--){
            stack.push(names[i]);
        }
        
        System.out.println("Initial stack");
        System.out.println("--------------------------------------------------");
        stack.print();
        
        // Remove two elements
        stack.pop();
        stack.pop();
        
        System.out.println("\n\nStack after removing two elements");
        System.out.println("--------------------------------------------------");
        stack.print();
             
        System.out.println("\n\nAttempting to add DANIEL to the stack:");
        System.out.println("--------------------------------------------------");
        try {
            stack.push(Name.valueOf("DANIEL"));
        } catch (IllegalArgumentException e) {
           System.out.println("Invalid name: " + e.getMessage());
        }
        
        System.out.println("\n\nRemove all the elements from the stack");
        System.out.println("--------------------------------------------------");
        while (!stack.isEmpty()) {
            System.out.println("Removed: " + stack.pop());
        }
    }
}
