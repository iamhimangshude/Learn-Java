package LeetCode;

public class Problem83 {
    static void main() {
        ListNode head = new ListNode(1);

        ListNode current = head;

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);

        head.next = one;
        one.next = two;

        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("----------------");

        current = deleteDuplicates(head);

        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode curr = head;

        while(curr != null){
            ListNode runner = curr.next;


            if (runner != null && runner.val == curr.val){
                runner = runner.next;
            }

            curr.next = runner;
            curr = curr.next;

        }

        return head;
    }
}
