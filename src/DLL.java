import org.jetbrains.annotations.Contract;

class DLL {
    private Node head;
    private Node tail;


    @Contract(pure = true)
    DLL() {
        this.head = null;
        this.tail = null;
    }

    // the push method will add a new node to the end of the list
    void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;

        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }

    void printValuesBackward() {
        // find the first node, aka head.
        Node current = this.tail;

        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.previous;
        }
    }

    Node pop() {
        Node toPop = tail;
        Node newTail = toPop.previous;
        newTail.next = null;
        tail = newTail;
        return toPop;
    }

    boolean contains(Integer value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    void insertAt(Node node, int index) {
        if (index == 0) {
            Node oldHead = head;
            node.next = oldHead;
            oldHead.previous = node;
            head = node;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            if (++count == index) {
                current.previous.next = node;
                node.previous = current.previous;
                current.previous = node;
                node.next = current;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            Node newHead = head.next;
            newHead.previous = null;
            head = newHead;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            if (++count == index) {
                Node prev = current.previous;
                Node next = current.next;
                prev.next = next;
                next.previous = prev;
            }
        }
    }
}
