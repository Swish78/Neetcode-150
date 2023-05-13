class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int mul = accumulate(nums.begin(),nums.end(),1,multiplies<int>());
        for(int i = 0;i<nums.size();i++){
            if(nums[i]>0){
                nums[i]/=mul;
            }
            else{
                nums[i] = 0;
            }
        }
        return nums;
    }
};