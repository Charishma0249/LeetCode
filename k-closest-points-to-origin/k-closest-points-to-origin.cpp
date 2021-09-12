class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<pair<int, vector<int>>> pq;
        
        for(vector<int> point: points){
            int distance = point[0] * point[0] + point[1] * point[1];
            pq.push(make_pair(distance, point));
            if(pq.size() > k)
                pq.pop();
        }
        
        vector<vector<int>> result;
        while(!pq.empty()){
            vector<int> temp = pq.top().second;
            result.push_back(temp);
            pq.pop();
        }
        
        reverse(result.begin(), result.end());
        return result;
    }
};