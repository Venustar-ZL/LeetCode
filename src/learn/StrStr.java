package learn;

/**
 * 给出needle在haystack中的位置
 * 相当于indexOf()
 */
public class StrStr {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            for (; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }

        }
        return -1;
    }


}
