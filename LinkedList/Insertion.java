class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    static Node head;

    public static void insertAtHead(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public static void insertAtEnd(int data) {
        Node newnode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static int lengthLL(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;

    }

    public static void insertAtPosition(int data, int pos) {
        Node newnode = new Node(data);
        Node temp = head;
        int i = 1;
        if (pos < 1) {
            System.out.println("Invalid Position");
            return;

        }
        if (pos == 1) {
            insertAtHead(data);
            return;
        }

        while (i < pos - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (pos == lengthLL(temp)) {
            insertAtEnd(data);
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

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
        insertAtHead(50);
        insertAtEnd(60);
        insertAtPosition(100, 7);
        printList(head);
    }

}