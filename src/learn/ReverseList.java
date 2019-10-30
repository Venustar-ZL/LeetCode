package learn;

/**
 * @ClassName: ReverseList
 * @Description: 反转一个单链表
 * @Date: 2019-10-30 09:48
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class ReverseList {

    /*
    // 思路2：迭代求解
    // 保存后置节点和前置节点
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

     */

    // 思路2：递归求解
    // 每次递归至链表末尾结束并返回该节点，将该节点添加
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 返回的p节点即为每次递归得到的尾节点
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
