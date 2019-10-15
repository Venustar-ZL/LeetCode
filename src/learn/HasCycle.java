package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断链表中是否有环
 */
@SuppressWarnings("all")
public class HasCycle {

    // 思路1：利用哈希表存储所有节点 在每次存储新节点时 判断是否已哈希表中是否已存在
    /*
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

     */

    // 思路2：设置快慢指针 若存在回环，快指针必会追上慢指针
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
