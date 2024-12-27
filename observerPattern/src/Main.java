public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Data data = new Data();
        Display display = new Display();

        data.addObserver(display);

        data.setValue(42);  // Automatically notifies the observer
    }
}