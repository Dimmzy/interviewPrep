public class maximumSubarray {

    public static int maxSubArrayNaive(int[] nums) {
        if (nums.length == 0) return 0;
        int runningTotal;
        int bestSeen = nums[0];

        for (int i = 0; i < nums.length; i++) {
            runningTotal = nums[i];
            if (runningTotal > bestSeen)
                bestSeen = runningTotal;

            for (int j = i + 1; j < nums.length; j++) {
                runningTotal += nums[j];
                if (runningTotal > bestSeen)
                    bestSeen = runningTotal;
            }
        }
        return bestSeen;
    }

    public static int maxSubArrayOpt(int[] nums) {
        if (nums.length == 0) return 0;

        int prev = nums[0];
        int bestSeenValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prev = prev > 0 ? nums[i] + prev : nums[i];
            bestSeenValue = Math.max(bestSeenValue, prev);
        }

        return bestSeenValue;
    }
}
