class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!deque.isEmpty()) {
                deque.addFirst(deque.pollLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] result = new int[n];
        int index = 0;
        for (int card : deque) {
            result[index++] = card;
        }
        return result;
    }
}