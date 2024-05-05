public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code if needed
    }

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance1 = Singleton.getInstance();

        // Access methods or properties of the singleton instance
        // For demonstration, let's print a message
        System.out.println("Singleton instance 1: " + singletonInstance1);

        // Trying to create another instance
        Singleton singletonInstance2 = Singleton.getInstance();

        // Both instances should be the same
        System.out.println("Singleton instance 2: " + singletonInstance2);

        // Checking if both instances are the same object
        System.out.println("Are both instances the same object? " + (singletonInstance1 == singletonInstance2));
    }
}
