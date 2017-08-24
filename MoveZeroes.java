class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer2 < nums.length) {
            if (nums[pointer2] != 0) {
                int temp = nums[pointer1];
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = temp;
                pointer1++;
            }
            pointer2++;
        }
    }
}
