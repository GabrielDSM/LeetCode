class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums != null && nums.length != 0) {
            int toInsert = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[toInsert] = nums[i];
                    toInsert++;
                }
            }
            
            for (int i = toInsert; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
