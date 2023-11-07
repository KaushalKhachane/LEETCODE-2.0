public class Generics1 {

    public static <T> T search(T arr[], T val) {
        for (T ele : arr) {
            if (val.equals(ele)) {
                return ele;
            }
        }
        return null; // Element not found
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Integer searchResult = search(intArray, 3);
        System.out.println("Search result: " + searchResult);

        String[] strArray = { "apple", "banana", "cherry", "date" };
        String strResult = search(strArray, "banana");
        System.out.println("Search result: " + strResult);
    }
}
