public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int index = 0;
        while (index < nums.length){
            if (nums[index] == 0){
                zeroCount++;
                index++;
            }else {
                nums[index - zeroCount] = nums[index];
                index++;
            }
        }
        if (zeroCount > 0){
            index = nums.length - zeroCount;
            while (index < nums.length){
                nums[index] = 0;
                index++;
            }
        }
    }
}
