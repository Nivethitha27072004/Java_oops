/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/
import java.util.*;
 public class isPalindromeNumber {
    public static  boolean isPalindrome(int x) {
        int orginalNumber=x;
        int remainder,reveseNum=0;
        if(x<0){
            return false;
        }
        while(x!=0){
        remainder=x%10;
        reveseNum=reveseNum*10+remainder;
        x=x/10;
        }
        return (orginalNumber==reveseNum);
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();  
    System.out.println(isPalindrome(n));   
    }
}