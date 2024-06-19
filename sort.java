import java.util.*;
public class sort {
    public static void main(String[] args) {
        System.out.println("hi");
        int[] arr = {6,7,1,2,9,5};
        System.out.println(Arrays.toString(sortLists(arr)));
        int[] nums = {1,1,2,3,3,4,4};
        System.out.println(singleNonDuplicate(nums));

    }
    public static int[] sortLists(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sortLists(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortLists(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            // Check if the mid index is even or odd and adjust it to be even
            if (mid % 2 == 1) {
                mid--;
            }
            
            // Compare pairs
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        
        // The single element is at the start (or end) index
        return nums[start];
    }
    public static int[] merge(int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] newArr = new int[left.length+right.length];
        while (i<left.length && j<right.length) {
            if(left[i]<=right[j]){
                newArr[k]= left[i];
                i++;
            }
            else{
                newArr[k]=right[j];
                j++;
                
            }
            k++;
        }

        while (i<left.length) {
            newArr[k]=left[i];
            i++;
            k++;
            
        }


        while (j<right.length) {
            newArr[k]=right[j];
            j++;
            k++;

        }

        return newArr;
    }
}
