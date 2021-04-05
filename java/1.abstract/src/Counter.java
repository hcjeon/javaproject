/**
 * The type Counter.
 */
public class Counter {
    /**
     * The Cnt.
     */
    int cnt = 0;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("before : " + counter.cnt);

        Updater updater = new Updater();
        updater.update(counter);
        System.out.println("after : " + counter.cnt);
    }
}
