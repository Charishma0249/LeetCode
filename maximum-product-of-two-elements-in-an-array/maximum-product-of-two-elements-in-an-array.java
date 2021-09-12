class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i< nums.length; i++)
        {
            pq.add(nums[i]-1);
        }
        
        System.out.println(pq);
        int firstNumber = pq.poll();
        int secondNumber = pq.poll();
        
        return firstNumber*secondNumber;
    }
}