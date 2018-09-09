import java.util.HashMap;

public class TwoSum {
    public static final int SIZE = 7;

    public static void main(String args[]){
        TwoSum twosum = new TwoSum();
        int[] nums ={2,7,11,17};;
        int[] targetNums = twosum.twoSum(nums,9);
        System.out.println( "First Index: "+targetNums[0] +", Second Index: "+ targetNums[1] );
        System.out.println("First Number:"+ nums[targetNums[0]] +", Second Number:"+nums[targetNums[1]]);

    }

    public  int[] twoSum(int[] nums, int target){
        int[] result= new int[2];
        if(nums == null && nums.length<2){
            return result;
        }
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target- nums[i];
            if(res.containsKey(temp)){
                result[0] = res.get(temp);
                result[1] = i;

            }else{
                res.put(nums[i],i);
            }
        }
        return result;
    }
}
