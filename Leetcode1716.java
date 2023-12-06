class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int monday = 1;
        int currentDay = 1;

        while (currentDay <= n) {
            totalMoney += monday;
            monday++;

            if (currentDay % 7 == 0) {
                monday = currentDay / 7 + 1; // Increment Monday's value on every subsequent Monday
            }

            currentDay++;
        }

        return totalMoney;
    }
}
