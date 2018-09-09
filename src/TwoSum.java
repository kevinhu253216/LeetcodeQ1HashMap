import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *给定一个目标数
 *在一个数组中搜索 某索引值 + 另个索引值
 *例如 目标值18 ，数组 {2,6,7,11,15}
 *只能得出11+7 =18 
 *而不能得出6+6+6 =18
 *最后把数组中的两个值的【索引值】放入到新数组中
 */

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
        if(nums == null && nums.length<2){ //if it is empty AND the length <2.
            return result;
        }
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target- nums[i];
            
            if(res.containsKey(temp)){// 2、compare res.containsKey(temp)
                result[0] = res.get(temp); //get Index of a number
                result[1] = i;             //3 get Index of this current array number

            }else{
                res.put(nums[i],i);  //1、 put into hashmap
            }
        }
        return result; //4 result
    }
}
