class Queue_Beispiel2 {
    class Koordinate {
        int x;
        int y;
    }
    
    public static void main(String[] args) {
        Queue<Koordinate> queue = new Queue<>();
        
        Koordinate coord = new Koordinate();
        coord.x = 100;
        coord.y = 150;
        queue.enqueue(coord);
    
        Koordinate koord = queue.front();
        System.out.println(koord.x);
        System.out.println(koord.y);

        queue.dequeue();
    }
}
