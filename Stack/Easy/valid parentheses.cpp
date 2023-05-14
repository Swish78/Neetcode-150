class Solution {
public:
    bool isValid(string s) {
        std::stack<char> st;  // create a stack to store opening brackets
        for(auto itr = s.begin(); itr!= s.end(); ++itr){ // iterate through each character in the string

            if(*itr == '(' || *itr =='{'|| *itr == '[')  // if it is an opening bracket, push it onto the stack
                st.push(*itr);

            else if(st.empty() || st.top() == '{' && *itr != '}'   || st.top() == '(' && *itr != ')' || st.top() == '[' && *itr != ']'){ // if it is a closing bracket, check if it matches the corresponding opening bracket at the top of the stack

                return false;  // if it does not match, return false
            }

            else st.pop();  // if it matches, pop the opening bracket from the stack

        }

        return st.empty() ? true : false;  // check if the stack is empty. if it is, the string is valid. otherwise, it is invalid.
    }
};
