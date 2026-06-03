package queues;

public class queueUsingArray {
    // static class queue {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // queue(int n) {
    // arr = new int[n];
    // size = n;
    // front = -1;
    // rear = -1;
    // }

    // public static boolean isEmpty() {
    // return rear == -1;
    // }

    // public static void add(int data) {
    // if (rear == size - 1) {
    // System.out.println("Queue is full");
    // return;
    // }

    // if (front == -1) {
    // front = 0;
    // }

    // rear = rear + 1;
    // arr[rear] = data;
    // }

    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // int front = arr[0];
    // for (int i = 0; i < rear; i++) {
    // arr[i] = arr[i + 1];
    // }
    // rear = rear - 1;
    // return front;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("Empty Queue");
    // return -1;
    // }

    // return arr[0];
    // }
    // }

    static class queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Empty");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
