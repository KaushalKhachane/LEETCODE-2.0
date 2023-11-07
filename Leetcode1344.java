class Solution {
    public double angleClock(int hour, int minutes) {
        float hours = (hour%12 + (float)minutes/60)*30; // 360/12
        int minute = minutes*6; // 360/60

        float angle = Math.abs(hours-minute);
        if(angle > 180) angle = 360 - angle;
        return angle;
    }
}       