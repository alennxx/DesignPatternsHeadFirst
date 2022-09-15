package singleton;

public class ChocolateCauldron {
    private boolean empty;
    private boolean boiled;

    private ChocolateCauldron() {
        empty = true;
        boiled = false;
    }

//    private static ChocolateCauldron instance;
//    public static synchronized ChocolateCauldron getInstance() {
//        if (instance == null) {
//            instance = new ChocolateCauldron();
//        }
//        return instance;
//    }

    private static final ChocolateCauldron instance = new ChocolateCauldron();
    public static ChocolateCauldron getInstance() {
        return  instance;
    }

//    private volatile static  ChocolateCauldron instance;
//    public static ChocolateCauldron getInstance() {
//        if (instance == null) {
//            synchronized (ChocolateCauldron.class) {
//                if (instance == null) {
//                    instance = new ChocolateCauldron();
//                }
//            }
//        }
//        return instance;
//    }

    public void fill() {
        if (empty) {
            //fill
            empty = false;
            boiled = false;
        }
    }

    public void empty() {
        if (!empty && boiled) {
            //empty
            empty = true;
        }
    }

    public void boil() {
        if (!empty && !boiled) {
            //boil
            boiled = true;
        }
    }
}

//203
