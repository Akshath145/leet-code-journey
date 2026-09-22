import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }

    public void generate(String current, int n, List<String> result) {
        if (current.length() == 2 * n) {
            if (isValid(current)) {
                result.add(current);
            }
            return;
        }

        generate(current + "(", n, result);
        generate(current + ")", n, result);
    }

    public boolean isValid(String s) {
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}