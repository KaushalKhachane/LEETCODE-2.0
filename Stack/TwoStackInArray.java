public class TwoStackInArray {
    int[] st;
    int top1;
    int top2;
    int size;

    public TwoStackInArray(int capacity) {
        st = new int[capacity];
        top1 = -1;
        top2 = capacity;
        size = capacity;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            st[++top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            st[--top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int val = st[top1];
            st[top1--] = 0; // Resetting the value to indicate empty slot
            return val;
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int val = st[top2];
            st[top2++] = 0; // Resetting the value to indicate empty slot
            return val;
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        int capacity = 10; // Adjust as needed
        TwoStackInArray stack = new TwoStackInArray(capacity);

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < arr.length / 2; i++) {
            stack.push1(arr[i]);
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            stack.push2(arr[i]);
        }

        System.out.println("Elements popped from Stack 1:");
        for (int i = 0; i < arr.length / 2; i++) {
            int val = stack.pop1();
            if (val != -1) {
                System.out.print(val + " ");
            }
        }
        System.out.println();

        System.out.println("Elements popped from Stack 2:");
        for (int i = arr.length / 2; i < arr.length; i++) {
            int val = stack.pop2();
            if (val != -1) {
                System.out.print(val + " ");
            }
        }
    }
}
