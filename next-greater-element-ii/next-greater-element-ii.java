class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        
        for(int i=0; i<2*len; i++)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%len])
            {
                res[stack.pop()] = nums[i%len];
            }
            if(i<len)
               stack.push(i); 
        }
        
        return res;
    }
}