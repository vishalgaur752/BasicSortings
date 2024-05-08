import java.util.*;
public class InbuiltSort{
    // public static void printArr(int nums[]) {
    //     for(int i = 0; i<nums.length; i++) {
    //         System.out.print(nums[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void printArr(Integer nums[]) {//this fuction use for reverseOrder
        for(int i = 0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String []args) {
        // int nums[] = {5, 4, 1, 3, 2};
        // Arrays.sort(nums);
        // Arrays.sort(nums, 0, 3);

        Integer nums[] = {5, 4, 1, 3, 2};
        Arrays.sort(nums, Collections.reverseOrder()); //reverse Order function work only on objects so, Integers not Int
        printArr(nums);
    }
}