
public class Main {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
        System.out.println(EnumSingleton.getInstance());
    }



}
