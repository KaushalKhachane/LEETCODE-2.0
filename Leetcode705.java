import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private List<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key)) {
            set.add(key);
        }
    }

    public void remove(int key) {
        set.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return set.contains(key);
    }
}
