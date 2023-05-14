class Solution {
  // This function checks if the given string is balanced.
  public boolean isValid(String s) {
    // Create a stack to store the opening brackets.
    Stack<Character> stack = new Stack<Character>();

    // Iterate through the string.
    for (char c : s.toCharArray()) {
      // If the current character is an opening bracket, push it onto the stack.
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      }

      // If the current character is a closing bracket, check if it matches the top of the stack.
      else if (stack.isEmpty() || (c == '}' && stack.peek() != '{') || (c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
        // If the brackets do not match, return false.
        return false;
      }

      // Otherwise, pop the top of the stack.
      else {
        stack.pop();
      }
    }

    // If the stack is empty, return true. This means that all of the brackets were balanced.
    return stack.isEmpty();
  }
}
