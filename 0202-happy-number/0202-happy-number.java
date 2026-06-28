class Solution {
    public int square(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (fast != slow);

        return fast == 1;
    }
}