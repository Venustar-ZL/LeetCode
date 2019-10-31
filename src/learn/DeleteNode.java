package learn;

/**
 * @ClassName: DeleteNode
 * @Description: 删除链表中的给定节点
 * @Date: 2019-10-31 11:29
 * @Author: ZhangLei
 * version: 1.0
 **/
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
