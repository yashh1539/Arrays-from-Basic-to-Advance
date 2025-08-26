package arrays;

public class Duplicateelement {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        display(nums);
        System.out.println(display(nums));
    }

    public static boolean display(int nums[]){
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]==nums[j]){
                    return true;
                }

            }

        }
        return false;
    }
}
