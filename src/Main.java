public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("racecar")); // should be true
        System.out.println(palindrome.isPalindrome("hello"));    // should be false
    }
}