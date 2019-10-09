package learn;


/**
 * 给定两个二进制字符串
 * 返回他们的和（用二进制表示）
 */
public class AddBinary {

    /**
     * 此题解法利用了ASCII码的相加，并不断追加对sum的求余和产生的进位
     * 最后对进位是否为1进行判断，决定是否增加位数
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            carry = sum / 2;
        }
        ans.append(carry == 1 ? carry : "");
        return ans.reverse().toString();
    }

}
