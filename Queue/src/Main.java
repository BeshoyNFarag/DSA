public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.setSize(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println();
        queue.print();
        queue.dequeue();
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        System.out.println(queue.peek());


    }
}
