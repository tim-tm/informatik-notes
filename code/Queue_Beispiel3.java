class Queue_Beispiel3 {
    class Koordinate {
        int x;
        int y;

        public Koordinate(int xNeu, int yNeu) {
            x = xNeu;
            y = yNeu;
        }
    }
    
    public static void main(String[] args) {    
        Queue<Koordinate> queue = new Queue<>();
        
        Koordinate coord = new Koordinate(100, 150);
        queue.enqueue(coord);
    }
}
