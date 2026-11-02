package structures;

import models.Name;

class Node {
    final Name value;
    Node next;
    
    Node(Name value, Node next) {
        this.value = value;
        this.next = next;
    }
}
