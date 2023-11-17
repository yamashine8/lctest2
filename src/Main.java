public class Main {
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
     */
    public static boolean isPalindrome(int x) {
        String temp = ""+x;
        int j = temp.length() - 1;
        for (int i = 0; i< temp.length(); i++){
            char c = temp.charAt(i);
            char d = temp.charAt(j);
            if (c==d){
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean withoutString(int x){
        int n= x % 10;
        int temp= x / 10;
        while (temp > 0) {
            n *= 10;
            n += temp % 10;
            temp /= 10;
        }
        return n==x;
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.print(isPalindrome(x));
        System.out.println(withoutString(x));
        x = -121;
        System.out.print(isPalindrome(x));
        System.out.println(withoutString(x));
        x = 10;
        System.out.print(isPalindrome(x));
        System.out.println(withoutString(x));
    }
}