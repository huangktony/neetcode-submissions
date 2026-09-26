class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        int maxCount = 0;

        for (char t : tasks) {
            counts[t - 'A']++;
            maxCount = Math.max(maxCount, counts[t - 'A']);
        }

        int numMax = 0;
        for (int c : counts) {
            if (c == maxCount) numMax++;
        }

        return Math.max(tasks.length, (maxCount - 1) * (n + 1) + numMax);
    }
}