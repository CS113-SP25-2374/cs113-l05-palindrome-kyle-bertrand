public class Palindrome implements StackInterface {
    /**
     * Break a stack into two, push the first half to one stack, then push
     * second half to a stack, then pop & push to a second stack.
     * If the string is odd, the middle element goes to both stacks (or neither!)
     * R A C E C A R
     * Stack 1: R A C E
     * Middle Letter: E
     * Stack 2: E C A R
     * Re-stack either the first or second stack and compare them.
     * @param s a string to test
     * @return true if they are the same
     */
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "").toLowerCase(); //make lowercase letters 
        ArrayListStack<Character> stack1 = new ArrayListStack<>(); //make 2 stacks 
        ArrayListStack<Character> stack2 = new ArrayListStack<>();

        // first string half
        for (int i = 0; i < (s.length() / 2); i++) {
            stack1.push(s.charAt(i));
        }

        // second string half
        for (int i = (s.length() + 1) / 2; i < s.length(); i++) {
            stack2.push(s.charAt(i));
        }

        // compare the halves
        while (!stack1.empty() && !stack2.empty()) {
            if (!stack1.pop().equals(stack2.pop())) {
                return false;
            }
    }
}
