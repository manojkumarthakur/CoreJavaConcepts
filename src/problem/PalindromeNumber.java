package problem;

/*
* https://leetcode.com/problems/palindrome-number/
*/

public class PalindromeNumber {
    public static void main(String[] args) {
       boolean isPal =  isPalindrome(-121);
        System.out.println(isPal);
    }

    public static boolean isPalindrome(int x){
        int temp = x;
        int rev = 0 ;
        if(x<0)
            return false;
        while (x>0){
            rev = rev*10 + x%10;
            x=x/10;
        }
        System.out.println("temp: " + temp);
        System.out.println("rev: " + rev);
        if(rev == temp)
            return true;
        else
            return false;

//         String s = new String(Integer.toString(x));
//         StringBuilder str = new StringBuilder(s);
//         String reverse = str.reverse().toString();
//         System.out.println("s: " + s);
//         System.out.println("reverse: " + str);
//         if(s.equals(reverse))
//             return true;
//         else
//             return false;
    }


}


