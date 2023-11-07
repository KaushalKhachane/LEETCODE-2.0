public class PrintDivisors {

    public static void printDivisors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    // print the divisors in the unsorted ordered O(sqrt(num))
    public static void divisors(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");

                if (i != num / i) {
                    System.out.println(num / i);
                }
            }

        }
    }

    // print the divisors in sorted order
    // the idea is 1st print the number less then sqrt(num using if(num % 2 == 0 ))
    // 2ndly print the number greater than sqrt(num) using if(num % i) {if(num/i)}
    public static void printDiv(int num) {
        int i = 1;
        for (i = 1; i * i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (num % i == 0)
                System.out.println(num / i);
        }
    }

    public static void main(String[] args) {
        printDivisors(6);
        System.out.println("-----------------");
        divisors(6);
        System.out.println("-----------------");
        printDiv(15);
    }
}
