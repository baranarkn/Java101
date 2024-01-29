
public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(325));
    }

    public static String isPalindrome(int number){
        int tempNumber = number, lastNumber, reverseNumber = 0;

        while (tempNumber!= 0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (number == reverseNumber){
            return (number + " is palindrome number.");
        } else {
            return (number + " is not palindrome number.");
        }
    }
}
