public class Main
 {
    public static void main(String[] args) {
        
       Pair<Double, String> pair = new Pair<>(1.11, "Hello");
       System.out.println("First element: " + pair.getFirst());
       System.out.println("Second element: " + pair.getSecond());

       pair.setFirst(4.88);
       pair.setSecond("World");
       System.out.println("Updated first element: " + pair.getFirst());
       System.out.println("Updated second element: " + pair.getSecond());
    }
}
