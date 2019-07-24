import org.jetbrains.annotations.Contract;

public class Node {
    Integer value;
    Node previous;
    Node next;

    @Contract(pure = true)
    Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
