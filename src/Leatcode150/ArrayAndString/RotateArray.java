package Leatcode150.ArrayAndString;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int j = 0;
        int[] nums2 = new int[nums.length];
        if (k > 0) {
            for (int i = k; i > 0; i--) {
                nums2[j] = nums[nums.length - i];
                j++;
            }
            for (int i = 0; i < nums.length - k; i++) {
                nums2[j] = nums[i];
                j++;
            }
        }
        nums = nums2;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void rotate2(int[] nums, int k) {//nums = [-1,-100,3,99], k = 2
        int n = nums.length;
        k = k % n;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }

    public void reverseInRange(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void reverse3(int[] nums, int k){
        k = k%nums.length;
        reverseInRange(nums,0,nums.length-1);
        reverseInRange(nums,k,nums.length-1);
        reverseInRange(nums,0,k-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
    public void reverse4(int[] nums, int k){
           k=nums.length%k;
           if(k>0) {//   0,1,2,3,4
               int[] arr = Arrays.copyOfRange(nums, 0, nums.length - k);//{1,2,3,4,5}
               int[] arr2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
               // using the pre-defined function arraycopy
               System.arraycopy(arr2, 0, nums, 0, arr2.length);
               System.arraycopy(arr, 0, nums, arr2.length, arr.length);
               System.out.println("Result = " + Arrays.toString(nums));
           }


    }
}


/*


if(k>0){
          for(int i=k;i>0;i--)
          {
             arr.add(nums[nums.length-i]);
          }
            for(int i=0;i<nums.length-k;i++)
            {
                arr.add(nums[i]);
            }
        }
 */