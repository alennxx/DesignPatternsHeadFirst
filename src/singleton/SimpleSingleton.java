package singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance;

    private SimpleSingleton() {
        //nop
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

}
