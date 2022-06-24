
package remove.element;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {7,7,7,4,2,6,34};
        int val = 7;
        int k = removeElement(nums, val);
        System.out.println(k);
    }
    
    static int removeElement(int[] nums, int val){
    int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                k++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                for(int j = i; j < nums.length ; j++){
                    if(nums[j] != val){
                        nums[i] += nums[j];
                        nums[j] = nums[i] - nums[j];
                        nums[i] = nums[i] - nums[j];
                    }
                }
            }
        }
        //k = nums.length - k;
        return k;
    }
    
}
