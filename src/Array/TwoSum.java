package Array;

public class TwoSum {
    //You have given one nums array and one target integer.
    //You have to find indices of array where the sum of two
    //element is equal to target integer

    //Solution: brute force approach
     //1)iterate whole array from start to end.
    //2)iterate again inside this array with starting position with first array
    //iteration starting position with +1
    //3)check condition where sum == target
public static int [] twoSum(int target, int nums[]) {
    int ans[]= new int[2];
    for (int i = 0; i < nums.length; i++) {
      for(int j=i+1; j<nums.length; j++){
          int sum= nums[i]+nums[j];
          if(sum==target){
              ans[0]=i;
              ans[1]=j;
          }
      }
    }

    return ans;
}
public static void main(String[] args){
    int [] nums={2,7,11,15};
    int target=9;
   for(int num:twoSum( target,nums)){
       System.out.print(num+", ");
   }



}

}
