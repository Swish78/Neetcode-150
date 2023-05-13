class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        // Create an unordered map to store the frequency of each number
        unordered_map<int,int> ump;
        // Create a priority queue to store the frequency of each number in descending order
        priority_queue<pair<int,int>> pq;
        for(auto i : nums){
            ump[i]++;
        }
        // Insert each element in the unordered map into the priority queue
        for(auto i : ump){
            pq.push(make_pair(i.second,i.first));
        }
        // Create a vector to store the k most frequent elements
        vector<int> sol;
        // Retrieve the k most frequent elements from the priority queue
        while(k--){
            sol.push_back(pq.top().second);
            pq.pop();
        }
        // Return the vector containing the k most frequent elements
        return sol;
    }
};
