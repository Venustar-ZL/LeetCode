package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 即判断括号是否符合规则
 */
public class BracketsIsValid {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int length = s.length();

        // 奇数不匹配
        if (length % 2 != 0) {
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (map.get(c) != topElement) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        if (stack.empty()) {
            return true;
        }
        else {
            return false;
        }

    }

}
