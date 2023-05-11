class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        // create a vector of vector of strings to store the grouped anagrams
        vector<vector<string>> groups;

        // create an unordered map to map sorted strings to their original unsorted strings
        unordered_map<string, vector<string>> anagramMap;

        // iterate over each string in the input vector
        for (const string& s : strs) {
            // create a copy of the string to sort
            string sorted = s;
            sort(sorted.begin(), sorted.end()); // sort the characters in the string

            // add the original unsorted string to the vector corresponding to the sorted string key in the map
            anagramMap[sorted].emplace_back(s);
        }

        // iterate over each vector of anagrams in the map and add it to the output vector
        for (auto entry : anagramMap) {
            groups.emplace_back(entry.second);
        }

        return groups;
    }
};
