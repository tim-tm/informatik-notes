class Queue_Beispiel1 {
    public static void main(String[] args) {       
        Queue<String> queue = new Queue<>();
        
        queue.enqueue("Hallo");

        System.out.println(queue.front());
        queue.dequeue();
    }   
}
