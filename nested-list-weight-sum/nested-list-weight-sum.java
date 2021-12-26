/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    int res=0;
    public int depthSum(List<NestedInteger> nestedList) {
        
        int size = nestedList.size();
        //int res=0, count=1;
        
        // for(int i=0; i<size; i++) {
        //     System.out.println(res);
            rec(nestedList, 0, nestedList, 1);
        // }
        return res;
    }
    
    public void rec(List<NestedInteger> tempList, int i, List<NestedInteger> nestedList, int count) {
        
        // int size = tempList.size();
        // if(size == 0) {
        //     while(tempList.get(i).isInteger()) {
        //         res+=count*(int)tempList.get(i).getInteger();
        //         i++;
        //     }
        // }
        // rec(tempList.get(i).getList(), i+1, nestedList, count);
        if(i>=tempList.size())
            return ;
        if(tempList.get(i).isInteger()) {
            res+=count*(int)tempList.get(i).getInteger();
            //for(int j=i+1; j<tempList.size(); j++)
            rec(tempList, i+1, nestedList, count);
        }
        else {
            
            rec(tempList.get(i).getList(), 0, nestedList, count+1);
            rec(tempList, i+1, nestedList, count);
        }
        
    }
}