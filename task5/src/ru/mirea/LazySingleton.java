
public class LazySingleton {
    private static LazySingleton instance;
    public void print(){
        System.out.println("First");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
            return instance;
        }
        return instance;
    }
}
