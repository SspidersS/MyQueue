public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue size after poll: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clearing: " + queue.size());
    }
}

