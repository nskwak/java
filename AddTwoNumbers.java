///////////////////////////////////////////////////////////////////////////////////
// function: LeetCode:Easy 26. Remove Duplicates from Sorted Array
// Input: [1,1,2]
// Output: [1,2]
// Input: [0,0,1,1,1,2,2,3,3,4]
// Output: [0,1,2,3,4]
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length <=1) return nums.length;
        int i =0;
        int j= 1;
        for(; j<nums.length;){
            if(nums[i] == nums[j]) j++;
            else nums[++i] = nums[j++];
        }
        return ++i;
    }
}

/*
///////////////////////////////////////////////////////////////////////////////////
// function: AddTwoIntegers

public class AddTwoIntegers {
    public static void main(String[] args) {
        
        int first = 10;
        int second = 20;
        double a = 2.345;
        double b = 325.654;
        String name = "Grace Kwak";

        int sum = first + second;
        double sumfloat = a + b;

        System.out.println("The sum is: " + sum);
        System.out.println("The sum is: " + sumfloat);
        System.out.println("My name is: " + name);
    }
}
*/