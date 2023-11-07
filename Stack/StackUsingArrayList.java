import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> A;
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    T pop() {
        T ret = null;
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else{
            ret = A.get(top);
            top--;
        }
        return ret;
    }   

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}

public class StackUsingArrayList {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("s1 after pushing 10, 20 and 30 :\n" + s1);
        s1.pop();
        System.out.println("s1 after pop :\n" + s1);
        System.out.println("pop: "+ s1.pop());

    }
}
