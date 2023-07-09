class Queue {

    int front;
    int rear;
    int size;
    int arr[];

    Queue(int size) {
        this.size = size;
        front = 0;
        rear = 0;
        arr = new int[size];
    }

    public void enqueue(int element) {
        if (rear == size) {
            System.out.println("Queue is Full");
        } else {
            arr[rear] = element;
            rear++;
        }
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int dequeueelement = arr[front];
            front++;
            if (front == rear) {
                front = 0;
                rear = 0;

            }
            return dequeueelement;
        }
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