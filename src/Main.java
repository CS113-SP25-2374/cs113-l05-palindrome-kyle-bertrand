public class Main {
    public static void main(String[] args) {

        String word = "RACECAR";
        Palindrome test = new Palindrome();
        boolean isPalindrome = test.isPalindrome(word);

        if(isPalindrome) {
            System.out.printf("%S is a palindrome.%n%n",word);
        }
        else{
            System.out.printf("%S is NOT a palindrome.%n%n",word);
        }
    }
}