public class CircularQueue {

    int front;
    int rear;
    int size;
    int arr[];

    CircularQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    public boolean enqueue(int element) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            System.out.println("Queue is Full");
            return false;
        } else if (front == -1) {
            front = rear = 0;
            arr[rear] = element;

        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            arr[rear] = element;
        } else {
            rear++;
            arr[rear] = element;
        }
        return true;
    }

    public boolean dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return false;
        }
         if (front == rear) {
            front = -1;
            rear = -1;

        }
        if
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    }

    public int front() {
        if (front == rear) {
            return -1;
        } else {
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(12);

        q.dequeue();
        q.dequeue();
        System.out.println(q.front());

    }

}
