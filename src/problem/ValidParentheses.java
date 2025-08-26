package problem;

/*
* https://leetcode.com/problems/valid-parentheses/
* */
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(arr.length % 2 == 1)
            return false;
        for(char c : arr){
            if (c == ')' || c == '}' || c == ']'){
                if(stack.empty())
                    return false;
                char popValue = stack.pop();
                if((c==')' && popValue=='(') || (c=='}' && popValue=='{') || (c==']' && popValue=='['))
                    continue;
                else
                    return false;
            } else {
                stack.push(c);
            }

        }
        return stack.size() == 0;
    }

    public static boolean isValidSol(String s) {
        Stack<Character> paren= new Stack<>();
        for(char c:s.toCharArray()){
            if (c == '(') {
                paren.push(')');
            } else if (c == '{') {
                paren.push('}');
            } else if (c == '[') {
                paren.push(']');
            } else {
                if (paren.isEmpty() || paren.pop() != c) {
                    return false;
                }
            }
        }
        return paren.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([]{})"));
        System.out.println(isValidSol("([]{})"));
    }
}
