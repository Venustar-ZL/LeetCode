package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * 找到两个单链表相交的起始节点
 */
@SuppressWarnings("all")
public class GetIntersectionNode {

    // 思路1：暴力破解 不可取
    /*
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA;
        ListNode ans = new ListNode(0);
        while (A != null) {
            ListNode B = headB;
            while (B != null) {
                if (A == B) {
                    return A;
                }
                B = B.next;
            }
            A = A.next;
        }
        return null;
    }
     */

    // 思路2：利用哈希表存储A链表 然后判断B链表节点是否在哈希表中
    /*
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            else {
                headB = headB.next;
            }
        }
        return null;
    }

     */

    // 思路3：双指针
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }
        return A;
    }
}
