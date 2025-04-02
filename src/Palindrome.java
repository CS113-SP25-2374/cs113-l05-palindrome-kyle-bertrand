public class Palindrome {
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
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();
        Stack<Character> flipped = new Stack<>();

        int length = s.length();
        for (int i = 0; i < length/2; i++) {
            first.push(s.charAt(i));
        }


        for (int i =length/2 + (length % 2); i < length; i++) {
            second.push(s.charAt(i));
        }

        while(!second.empty()){
            flipped.push(second.pop());
        }

        while(!first.empty()){
            if(!first.pop().equals(flipped.pop())){
                return false;
            }
        }

        return true;
    }
}
