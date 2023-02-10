public class Singleton {

    private static  Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance");
            instance = new Singleton();
        }

        System.out.println("Returning instance");
        return instance;
    }
}
