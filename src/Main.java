public class Main {

    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        dll.printValuesForward();
        System.out.println("=======================");
        dll.printValuesBackward();
        System.out.println("=======================");
        System.out.println(dll.size());
        System.out.println("=======================");
        System.out.println(dll.pop());
        System.out.println("=======================");
        dll.printValuesForward();
        System.out.println("=======================");
        System.out.println(dll.contains(60));
        System.out.println("=======================");
        System.out.println(dll.contains(70));
        System.out.println("=======================");
        System.out.println(dll.size());
        System.out.println("=======================");
        dll.removeAt(2);
        System.out.println("=======================");
        dll.printValuesForward();
        System.out.println("=======================");
        dll.insertAt(new Node(17), 2);
        System.out.println("=======================");
        dll.printValuesForward();
        System.out.println("=======================");
        dll.removeAt(3);
        System.out.println("=======================");
        dll.printValuesForward();
        System.out.println("=======================");
        dll.insertAt(new Node(523), 1);
        System.out.println("=======================");
        dll.printValuesForward();
    }
}
