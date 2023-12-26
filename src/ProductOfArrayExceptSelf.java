public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] multipleFromLeft = new int[nums.length + 1];
        multipleFromLeft[0] = 1;
        int[] multipleFromRight = new int[nums.length + 1];
        multipleFromRight[0] = 1;
        int[] result = new int[nums.length];
        for(int i = 1; i < nums.length + 1; i++){
            multipleFromLeft[i] = multipleFromLeft[i - 1] * nums[i - 1];
            multipleFromRight[i] = multipleFromRight[i - 1] * nums[nums.length - i];
        }
        for (int i = 0; i < nums.length; i++){
            result[i] = multipleFromLeft[i] * multipleFromRight[multipleFromRight.length - i - 2];
        }
        return result;
    }

}
