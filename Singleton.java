public class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {
        // private constructor to prevent instantiation
        str = "Hello, I am a singleton!";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/*class main{
    private static Singleton instance;
    public String str;

    private Singleton() {
        // private constructor to prevent instantiation
        str = "Hello, I am a singleton!";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.str);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);  // true (same object)
    }
}
public class main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        System.out.println(s1.str);

        Singleton s2 = Singleton.getSingleInstance();
        System.out.println(s1 == s2);  // true (same object)
    }
}
*/
