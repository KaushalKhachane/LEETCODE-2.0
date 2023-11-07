public class KStack {

    static class kStack {

        int arr[];
        int top[];
        int next[];

        int n, k;
        int free;

        kStack(int noofstack, int totalsize) {
            k = noofstack;
            n = totalsize;

            arr = new int[n];
            top = new int[k];
            next = new int[n];

            for (int i = 0; i < k; i++) {
                top[i] = -1;
            }

            for (int i = 0; i < n - 1; i++) {
                next[i] = i + 1;
            }
            next[n - 1] = -1;

        }

        boolean isEmpty(int sn) {
            return (top[sn] == -1);
        }

        boolean isFull() {
            return free == -1;
        }

        void push(int x, int sn) {
            
            if (isFull()) 
            {
                System.out.println("Stack Overflow");
                return;
            }
            int i = free;
            free = next[i];
            next[i] = top[sn];
            top[sn] = i;
            arr[i] = x;
        }

        int pop(int sn) {
            if (isEmpty(sn)) 
            {
                System.out.println("Stack Underflow");
                return Integer.MAX_VALUE;
            }
            int i = top[sn];
            top[sn] = next[i];
            next[i] = free;
            free = i;
            return arr[i];
        }
    }

    public static void main(String[] args) {
        int k = 3, n = 10;
        
        kStack ks = new kStack(k, n);
        
        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }

}
