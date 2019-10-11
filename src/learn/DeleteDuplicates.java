package learn;

/**
 * 删除排序链表中的重复元素
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode list = head;
        while (list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            }
            else {
                list = list.next;
            }
        }
        return head;
    }

}
