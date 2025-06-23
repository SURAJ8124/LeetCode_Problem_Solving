package Two_Pointer_Technique.problems;

public class Remove_Duplicate_From_sorted_array {
    /*
   Problem.26)Given an integer array nums sorted in non-decreasing order,
   remove the duplicates in-place such that each unique element appears
   only once. The relative order of the elements should be kept the same.
   Then return the number of unique elements in nums.

   Example 1:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]

    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     */
    public static int removeDuplicateFromSortedArray(int []nums){
         int uniqueElements=0;
         int first=0;
         int second=first+1;
         while (second<nums.length){
           if(nums[first]!=nums[second]){
               first++;
               nums[first]=nums[second];
           }
           second++;
         }
         uniqueElements=first+1;
         System.out.println("Elements Are: ");
        for(int num:nums){
            System.out.print(num+",");
        }
        System.out.println();
         return uniqueElements;

    }
    public static void main(String[] args){
        int []array={1,1,2};
        int []arraySecond={0,0,1,1,2,2,3,3,4};
        System.out.print("UniqueElements:"+removeDuplicateFromSortedArray(array));
        System.out.println();
        System.out.print("UniqueElements:"+removeDuplicateFromSortedArray(arraySecond));
        System.out.println();

    }
}
