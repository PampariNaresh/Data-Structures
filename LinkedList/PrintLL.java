
public class PrintLL {
    static Node head;

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node node1 = new Node(10);
        head = node1;
        node1.next = new Node(20);
        node1.next.next = new Node(30);
        node1.next.next.next = new Node(40);
        printList(head);
    }

}
