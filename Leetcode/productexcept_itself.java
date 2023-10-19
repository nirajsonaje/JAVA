package Leetcode;
// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
//https://leetcode.com/problems/product-of-array-except-self/description/
public class productexcept_itself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int pre[] = new int[n];
        int suff[] = new int[n];

        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
            //pre[1]=pre[0]*mums[0]  1*1=1
            //pre[2]=pre[1]*nums[1]  1*2=2
            //pre[3]=pre[2]*nums[2]  2*3=6 
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
            //suff[3]=1
            //suff[2]=suff[3]*nums[3]=1*4
             //suff[1]=suff[2]*nums[2]=4*3
              //suff[0]=suff[1]*nums[1]=12*1

        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}
