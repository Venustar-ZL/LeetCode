package learn;

/**
 * @ClassName: IsPalindromeList
 * @Description: 判断一个链表是否是回文链表
 * @Date: 2019-10-30 15:28
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsPalindromeList {

    // 双指针法
    // 双指针从哪开始 怎么移动
    // 如何判断回文
    // 找到链表中间节点,翻转前半部分链表?
    // 反转链表与原链表做比较?
    // 记录节点值?
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 找到链表的中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 翻转前半部分链表
        ListNode prev = null;
        ListNode curr = head;
        while (curr != slow) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // 判断奇偶
        if (fast != null) {
            slow = slow.next;
        }

        // 将前半部分翻转的链表与后半部分未翻转的链表做比较
        while (slow != null && prev != null) {
            if (slow.val != prev.val) {
                return false;
            }
            else {
                slow = slow.next;
                prev = prev.next;
            }
        }
        return true;
    }

}
