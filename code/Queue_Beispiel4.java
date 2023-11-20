class Queue_Beispiel4 {
    public static void main(String[] args) {
        // Die Queue der Aufgabenstellung erstellen, damit der Code ausführbar ist
        Queue<String> queue = new Queue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("Test");
        queue.enqueue("Element4");
        queue.enqueue("69420");

        while (!queue.isEmpty()) {
            String s = queue.front();

            System.out.println(s);
            queue.dequeue();
        }
    }
}
